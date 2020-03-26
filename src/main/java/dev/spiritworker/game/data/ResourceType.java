package dev.spiritworker.game.data;

public @interface ResourceType {

    String name();
    ResourceIdType idType();
    String scriptFile() default "";

    public enum ResourceIdType {
        BYTE, SHORT, INT;
    }
}