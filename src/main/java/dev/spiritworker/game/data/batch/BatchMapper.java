package dev.spiritworker.game.data.batch;

import org.w3c.dom.Node;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.lang.reflect.Field;

import dev.spiritworker.util.Position;

public class BatchMapper {

    public static VBatch mapDocument(String name, Document doc) {
        VBatch batch = new VBatch(name);
        NodeList list = null;

        list = doc.getDocumentElement().getElementsByTagName("VStartEventBox");
        for (int i = 0; i < list.getLength(); i++) {
            Element node = (Element) list.item(i);
            batch.setStartEventBox((VStartEventBox) map(VStartEventBox.class, node));
        }

        list = doc.getDocumentElement().getElementsByTagName("VMazeEscapeBox");
        for (int i = 0; i < list.getLength(); i++) {
            Element node = (Element) list.item(i);
            batch.setMazeEscapeBox((VMazeEscapeBox) map(VMazeEscapeBox.class, node));
        }

        list = doc.getDocumentElement().getElementsByTagName("VMonsterSpawnBox");
        for (int i = 0; i < list.getLength(); i++) {
            Element node = (Element) list.item(i);
            batch.getMonsterSpawnBoxes().add((VMonsterSpawnBox) map(VMonsterSpawnBox.class, node));
        }

        list = doc.getDocumentElement().getElementsByTagName("VLuaFunctionBox");
        for (int i = 0; i < list.getLength(); i++) {
            Element node = (Element) list.item(i);
            batch.getLuaFunctionBoxes().add((VLuaFunctionBox) map(VLuaFunctionBox.class, node));
        }

        list = doc.getDocumentElement().getElementsByTagName("VSectorBox");
        for (int i = 0; i < list.getLength(); i++) {
            Element node = (Element) list.item(i);
            batch.getSectorBoxes().add((VSectorBox) map(VSectorBox.class, node));
        }

        list = doc.getDocumentElement().getElementsByTagName("VCheckMonsterSpawnBox");
        for (int i = 0; i < list.getLength(); i++) {
            Element node = (Element) list.item(i);
            batch.getCheckMonsterSpawnBoxes().add((VCheckMonsterSpawnBox) map(VCheckMonsterSpawnBox.class, node));
        }

        list = doc.getDocumentElement().getElementsByTagName("VPortalBox");
        for (int i = 0; i < list.getLength(); i++) {
            Element node = (Element) list.item(i);
            batch.getPortalBoxes().add((VPortalBox) map(VPortalBox.class, node));
        }

        list = doc.getDocumentElement().getElementsByTagName("VPortalExitBox");
        for (int i = 0; i < list.getLength(); i++) {
            Element node = (Element) list.item(i);
            batch.getPortalExitBoxes().add((VPortalExitBox) map(VPortalExitBox.class, node));
        }

        list = doc.getDocumentElement().getElementsByTagName("VServerGateBox");
        for (int i = 0; i < list.getLength(); i++) {
            Element node = (Element) list.item(i);
            batch.getGateBoxes().add((VServerGateBox) map(VServerGateBox.class, node));
        }

        list = doc.getDocumentElement().getElementsByTagName("VWayPoint");
        for (int i = 0; i < list.getLength(); i++) {
            Element node = (Element) list.item(i);
            batch.getWayPoints().add((VWayPoint) map(VWayPoint.class, node));
        }

        list = doc.getDocumentElement().getElementsByTagName("VCommonPositionBox");
        for (int i = 0; i < list.getLength(); i++) {
            Element node = (Element) list.item(i);
            VCommonPositionBox box = (VCommonPositionBox) map(VCommonPositionBox.class, node);
            batch.getPositionBoxes().put(box.getID(), box);
        }

        return batch;
    }

    private static Object map(Class<?> c, Element element) {
        Object obj = null;

        try {
            obj = c.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        NodeList list = element.getChildNodes();
        for (int i = 0; i < list.getLength(); i++) {
            Node n = list.item(i);

            if (!(n instanceof Element)) {
                continue;
            }

            Element node = (Element) n;

            try {
                Field f = c.getDeclaredField(node.getNodeName());
                f.setAccessible(true);
                String value = node.getAttribute("value");

                switch (node.hasAttribute("type") ? node.getAttribute("type") : node.getAttribute("valuetype")) {
                    case "0":
                        f.set(obj, Integer.parseInt(value));
                        break;
                    case "2":
                        f.set(obj, Float.parseFloat(value));
                        break;
                    case "5":
                        f.set(obj, Boolean.parseBoolean(value));
                        break;
                    case "7":
                        f.set(obj, new Position(value));
                        break;
                    case "4": // Enum
                    case "12": // String
                    case "132": // Color
                    default:
                        f.set(obj, value);
                        break;
                }
                f.setAccessible(false);
            } catch (Exception e) {
                e.printStackTrace();
                continue;
            }
        }

        return obj;
    }
}