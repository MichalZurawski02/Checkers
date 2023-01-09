module Checkers {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;

    opens org.example.Client to javafx.fxml;
    exports org.example.Client;
    exports org.example.Client.Connection;
    opens org.example.Client.Connection to javafx.fxml;
}