package br.blog.carneiro.mycadfx;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;

public class MyCadMainController {

    @FXML
    private Canvas mainCanvas;

    @FXML
    public void onKeyReleased(KeyEvent keyEvent) {
        GraphicsContext gc = mainCanvas.getGraphicsContext2D();

        gc.setFill(Color.BLUE);
        gc.fillRect(75,75,100,100);
    }
}
