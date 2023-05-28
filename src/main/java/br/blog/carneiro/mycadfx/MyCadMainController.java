package br.blog.carneiro.mycadfx;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import lombok.extern.java.Log;

@Log
public class MyCadMainController {

    @FXML
    private Canvas mainCanvas;

    @FXML
    public void onKeyReleased(KeyEvent keyEvent) {
        String key = keyEvent.getText();
        log.warning(key);
        // TODO: replace with action mapping
        if (key.equalsIgnoreCase("R")) {
            GraphicsContext gc = mainCanvas.getGraphicsContext2D();
            gc.setFill(Color.BLUE);
            gc.fillRect(75, 75, 100, 100);
        }
    }
}
