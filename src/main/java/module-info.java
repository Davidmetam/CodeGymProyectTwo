module com.theisland.theisland {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.theisland.Island to javafx.fxml, com.google.gson;
    exports com.theisland.Island;
}