# SLM_Projekt_Monitor
Github Repository für das Semesterprojekt in SLM

Es soll ein Maintenance Monitor programmiert werden, der den derzeitigen Zustand des Kraftwerks darstellt.

Wenn alles Funktioniert soll "Everything operates as expected" ausgegeben werden. Dabei soll es den Wartungsarbeitern möglich sein die Nachricht manuell zum Beispiel auf "Service checks: No power until 5:00 pm" zu ändern. Anschließend sollte die Nachricht wieder resettet werden.

# Setup

Auf dem main Branch ist der letzte funktionierende und getestete Stand, der development Branch wird von den Entwicklern verwendet.

Das Github-Repo lokal clonen und dann den Ordner in IntelliJ (oder einem anderen Programm) öffnen. Danach sollte die Spring-Boot application über die Klasse "SlmProjektMonitorApplication" gestartet werden.

# Funktion

Über localhost:8080/api/message kann man dann den aktuellen Stand des Maintenance-Monitors abrufen.
Über /api/message/set?m=Wartung kann man eine neue Wartungsmeldung hinzufügen
Über /api/message/reset kann man die aktuelle Wartungsmeldung wieder löschen

Beim setten und resetten wird die aktuelle Zeit aktualisiert, damit man sehen kann wann die Seite das letzte mal bearbeitet wurde.


