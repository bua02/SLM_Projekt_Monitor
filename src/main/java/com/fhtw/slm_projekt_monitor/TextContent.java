package com.fhtw.slm_projekt_monitor;

public class TextContent {
    public static String getRedMonitor(String message, String lastUpdate) {
        return String.format("<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Monitor</title>\n" +
                "</head>\n" +
                "<body style=\"background-color:red;\">\n" +
                "\n" +
                "<h1 style=\"text-align:center; \">Maintenance Monitor</h1>\n" +
                "<p style=\"text-align:center\">%s</p>\n" +
                "<p style=\"text-align:center\">last update: %s</p>\n" +
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
                "<body style=\"background-color:green;\">\n" +
                "\n" +
                "<h1 style=\"text-align:center;\">Maintenance Monitor</h1>\n" +
                "<p style=\"text-align:center\">%s</p>\n" +
                "<p style=\"text-align:center\">last update: %s</p>\n" +
                "\n" +
                "</body>\n" +
                "</html>", message, lastUpdate);
    }
}
