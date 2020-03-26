package dev.spiritworker.game.data;

import org.w3c.dom.Document;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import java.io.File;
import java.util.Map;
import java.util.HashMap;
import java.nio.charset.StandardCharsets;

import dev.spiritworker.SpiritWorker;
import dev.spiritworker.util.FileUtils;
import dev.spiritworker.game.data.batch.VBatch;
import dev.spiritworker.game.data.batch.BatchMapper;

public class MapResourceLoader {

    private final static Logger logger = LogManager.getLogger(MapResourceLoader.class);

    private static DocumentBuilder xmlBuilder;
    private static Map<String, VBatch> batchMap = new HashMap<>();
    private static Map<String, String> scripts = new HashMap<>();

    static {
        try {
            xmlBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }

    public static DocumentBuilder getXmlBuilder() { return xmlBuilder; }

    public static synchronized void registerBatch(String name, Document batchDocument) {
        batchMap.put(name, BatchMapper.mapDocument(name, batchDocument));
    }

    public static Map<String, VBatch> getBatchCache() { return batchMap; }
    public static Map<String, String> getScripts()    { return scripts; }

    public static synchronized void registerScript(String name, String raw) {
        scripts.put(name, raw);
    }

    /** public static void loadBatches() {
        File dir = new File(SpiritWorker.getConfig().RESOURCE_FOLDER + "batches");

        if (!dir.exists() || !dir.isDirectory()) {
            return;
        }

        for (File file : dir.listFiles()) {
            try {
                final Document doc = getXmlBuilder().parse(file);
                ResourceLoader.addTask(() -> {
                    try {
                        doc.getDocumentElement().normalize();
                        registerBatch(FileUtils.getFilenameWithoutPath(file.getName()), doc);
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    } finally {
                        ResourceLoader.semaphore.release();
                    }
                });
            } catch (Exception e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        }
    } */
    /** public static void loadScripts() {
        File dir = new File(SpiritWorker.getConfig().RESOURCE_FOLDER + "scripts/Server");

        if (!dir.exists() || !dir.isDirectory()) {
            return;
        }

        for (File file : dir.listFiles()) {
            try {
                String luaScript = new String(
                        FileUtils.read(file),
                        StandardCharsets.UTF_8
                );

                // Removes a possible UTF-8 BOM
                if (luaScript.startsWith("\uFEFF")) {
                    luaScript = luaScript.substring(1);
                }

                registerScript(FileUtils.getFilenameWithoutPath(file.getName()), luaScript);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    } */

    public static void load() {
        logger.info("Loading scripts and batch files...");
        long time = System.currentTimeMillis();
        //loadBatches();
        ResourceLoader.waitForTasks();
        //loadScripts();
        logger.info("Load complete. Took " + (System.currentTimeMillis() - time) + " ms.");
    }
}
