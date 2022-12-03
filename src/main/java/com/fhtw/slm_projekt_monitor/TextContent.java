package com.fhtw.slm_projekt_monitor;

public class TextContent {
    public static String getRedMonitor(String message, String lastUpdate) {
        return String.format("<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Monitor</title>\n" +
                "</head>\n" +
                "<body style=\"background-color:#D22B2B;\">\n" +
                "\n" +
                "<h1 style=\"text-align:center; color:white;\">Maintenance Monitor</h1>\n" +
                "<p style=\"text-align:center; color:white;\">%s</p>\n" +
                "<p style=\"text-align:center; color:white;\">last update: %s</p>\n" +
                "\n" +
                "</body>\n" +
                "</html>", message, lastUpdate);
    }

    public static String getGreenMonitor(String message, String lastUpdate) {
        return String.format("<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Monitor</title>\n" +
                "</head>\n" +
                "<body style=\"background-color:#32CD32;\">\n" +
                "\n" +
                "<h1 style=\"text-align:center; color:white;\">Maintenance Monitor</h1>\n" +
                "<p style=\"text-align:center; color:white;\">%s</p>\n" +
                "<p style=\"text-align:center; color:white;\">last update: %s</p>\n" +
                "\n" +
                "</body>\n" +
                "</html>", message, lastUpdate);
    }
}
