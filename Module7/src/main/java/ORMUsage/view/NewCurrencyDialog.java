package ORMUsage.view;

import ORMUsage.application.ConverterController;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Window;

public class NewCurrencyDialog extends Stage {
    private ConverterController controller;

    private TextField code = new TextField();
    private TextField name = new TextField();
    private TextField rateToEur = new TextField();
    private Label info = new Label();
    private Button submit = new Button("Create");

    public NewCurrencyDialog(ConverterController controller, Window owner) {
        this.controller = controller;

        initModality(Modality.APPLICATION_MODAL);
        initOwner(owner);
        setTitle("Add New Currency");

        this.code.setPromptText("Currency code");
        this.name.setPromptText("Currency name");
        this.rateToEur.setPromptText("Rate to EUR");

        HBox fieldsWrapper = new HBox(6, this.code, this.name, this.rateToEur);
        fieldsWrapper.setAlignment(Pos.CENTER);

        VBox root = new VBox(10,
            new Label("Add a new currency"),
            fieldsWrapper,
            this.submit,
            this.info
        );
        root.setPadding(new Insets(12));
        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root, 550, 200);
        scene.getStylesheets().add("currency-converter.css");
        setScene(scene);

        this.submit.setOnAction(event -> handleSubmit());
    }

    private void handleSubmit() {
        String codeVal = this.code.getText().trim();
        String nameVal = this.name.getText().trim();
        String rateVal = this.rateToEur.getText().trim();

        if (codeVal.isEmpty() || nameVal.isEmpty() || rateVal.isEmpty()) {
            this.info.setText("All fields are required.");
            this.info.getStyleClass().add("err");
            return;
        }

        if (this.controller.recordExists(codeVal)) {
            this.info.setText("Currency with this code already exists.");
            this.info.getStyleClass().add("err");
            return;
        }

        double rate;
        try {
            rate = Double.parseDouble(rateVal);
        } catch (NumberFormatException e) {
            this.info.setText("Rate must be a positive decimal number. E.g. 10.50");
            this.info.getStyleClass().add("err");
            return;
        }

        // all validations passed, add the currency
        this.controller.addCurrency(codeVal, nameVal, rate);
        this.close();
    }

    public void open() {
        this.code.clear();
        this.name.clear();
        this.rateToEur.clear();
        this.info.setText("");
        this.info.getStyleClass().remove("err");
        this.showAndWait();
    }
}
