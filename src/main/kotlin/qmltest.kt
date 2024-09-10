import io.qt.QtUtilities
import io.qt.core.QUrl
import io.qt.quick.QQuickView
import io.qt.widgets.QApplication

fun main(args: Array<String>) {
    QApplication.initialize(args)
    QtUtilities.initializePackage("io.qt.network");
    QtUtilities.initializePackage("io.qt.quick");

    val view = QQuickView()
    view.source = QUrl("qrc:/test.qml")
    view.show()
    QApplication.exec()
    QApplication.shutdown()
}