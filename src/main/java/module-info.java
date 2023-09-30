module com.kensoftph.mediaplayer {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.kensoftph.mediaplayer to javafx.fxml;
    exports com.kensoftph.mediaplayer;
}