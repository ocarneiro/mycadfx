module br.blog.carneiro.mycadfx {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens br.blog.carneiro.mycadfx to javafx.fxml;
    exports br.blog.carneiro.mycadfx;
}