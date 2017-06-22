package net.kirkstork.examples.piechartview

import org.osgi.service.component.annotations.Component
import tornadofx.*
import tornadofx.osgi.ViewProvider


@Component
class ViewRegistration : ViewProvider {
	override val discriminator = "dashboard"
	override fun getView() = find(PiechartView::class)
}

class PiechartView : View() {
	override val root = piechart("Imported Fruits") {
		data("Grapefruit", 12.0)
		data("Oranges", 25.0)
		data("Plums", 10.0)
		data("Pears", 22.0)
		data("Apples", 30.0)
	}
}
