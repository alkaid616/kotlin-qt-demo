import io.qt.core.QFile
import io.qt.core.QIODeviceBase
import io.qt.gui.QIcon
import io.qt.widgets.QApplication
import io.qt.widgets.QMessageBox
import io.qt.widgets.QPushButton
import io.qt.widgets.QWidget
import io.qt.widgets.tools.QUiLoader

fun main(args: Array<String>) {
    QApplication.initialize(args)
    val loader = QUiLoader()

    val device = QFile(":/test.ui")
    device.open(QIODeviceBase.OpenModeFlag.ReadOnly)
    val widget: QWidget = loader.load(device)

    widget.windowIcon = QIcon(":/res/test.png")
    device.close()
    QPushButton("click", widget).apply {
        clicked.connect({ _ ->
            QMessageBox.information(widget, "Hello", "You clicked the button")
        })
    }

    widget.show()
    QApplication.exec()
    QApplication.shutdown()
}