module br.com.betterhungry.betterhungry {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires java.sql;

    opens br.com.betterhungry.controllers to javafx.fxml;
    exports br.com.betterhungry.controllers;
    exports br.com.betterhungry;
    opens br.com.betterhungry to javafx.fxml;
    exports br.com.betterhungry.controllers.controllersCliente;
    opens br.com.betterhungry.controllers.controllersCliente to javafx.fxml;
    exports br.com.betterhungry.controllers.controllersRestaurante;
    opens br.com.betterhungry.controllers.controllersRestaurante to javafx.fxml;
}