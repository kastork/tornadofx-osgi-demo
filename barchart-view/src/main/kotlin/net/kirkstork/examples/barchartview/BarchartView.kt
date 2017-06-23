package net.kirkstork.examples.barchartview

import javafx.scene.chart.CategoryAxis
import javafx.scene.chart.NumberAxis
import org.osgi.service.component.annotations.Component
import tornadofx.*
import tornadofx.osgi.ViewProvider


@Component
class ViewRegistration : ViewProvider {
	override val discriminator = "dashboard"
	override fun getView() = find(BarchartView::class)
}

class BarchartView : View() {
	override val root = barchart("Stock Monitoring, 2010", CategoryAxis(), NumberAxis()) {
		series("Portfolio 1") {
			data("Jan", 23)
			data("Feb", 14)
			data("Mar", 15)
		}
		series("Portfolio 2") {
			data("Jan", 11)
			data("Feb", 19)
			data("Mar", 27)
		}
	}
}
