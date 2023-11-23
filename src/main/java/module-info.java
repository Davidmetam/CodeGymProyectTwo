module com.theisland.theisland {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.theisland.Island to javafx.fxml;
    exports com.theisland.Island;
}