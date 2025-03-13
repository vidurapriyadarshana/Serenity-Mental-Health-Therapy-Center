module edu.ijse.therapycenter {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.ijse.therapycenter to javafx.fxml;
    exports edu.ijse.therapycenter;
}