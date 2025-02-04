module com.example.gestionclinique {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.gestionclinique to javafx.fxml;
    exports com.example.gestionclinique;
}