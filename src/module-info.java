module workshopJavafxJdbc {
	   requires javafx.controls;
       requires javafx.fxml;
	requires java.sql;
	requires javafx.graphics;
       opens application to javafx.graphics, javafx.fxml;
       opens gui to javafx.graphics, javafx.fxml;
       opens model.entities to javafx.graphics, javafx.fxml, javafx.base;
       opens model.services to javafx.graphics, javafx.fxml;
       opens model.dao to javafx.graphics, javafx.fxml, javafx.base;
       opens model.dao.impl to javafx.graphics, javafx.fxml, javafx.base;
}
