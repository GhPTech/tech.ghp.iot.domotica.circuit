<h1><img src="http://enroute.osgi.org/img/enroute-logo-64.png" witdh=40px style="float:left;margin: 0 1em 1em 0;width:40px">
IoT Domotica Circuit application</h1>

This repository is a typical Internet of Things (IoT) application based on [OSGi][1] framework. The application is developed in the [Eclipse][2] environment with [Bndtools][3] templates following [OSGi enRoute][4] tutorials. The workspace has support for [continuous integration][5] with [gradle][6].

The application is based on [OSGi enRoute IoT tutorial][7]. Its purpose is to control a hardware with the help of a [Raspbery Pi][8]. In this tutorial a LED is turned on and off based on an event triggered by a physical push-button and a programmed schedule.

The chip [BCM2835][9] controls and gets input from hardware. The pins of this chip are assigned and registered with the [Pi4J GpioController][11]. The bundle [OSGi enRoute][11] bundle *osgi.enroute.iot.pi.provider* (a version of the [Pi4j][10] library) is employed for this purpose.

Furthermore, the bundle [osgi.enroute.iot.circuit.provider][12] allows assignment of the GPIO pins via the *Configuration Admin* of *Webconsole*. Connections between the assigned hardware components can be realised with this bundle.

[1]:  http://osgi.org/
[2]:  https://eclipse.org/
[3]:  http://bndtools.org/
[4]:  http://enroute.osgi.org/book/150-tutorials.html
[5]:  http://enroute.osgi.org/tutorial_base/800-ci.html
[6]:  https://www.gradle.org/
[7]:  http://enroute.osgi.org/tutorial_iot/050-start.html
[8]:  https://www.raspberrypi.org/products/raspberry-pi-2-model-b/
[9]:  https://www.raspberrypi.org/documentation/hardware/raspberrypi/bcm2835/README.md
[10]: http://pi4j.com
[11]: http://pi4j.com/example/control.html
[11]: http://enroute.osgi.org
[12]: http://enroute.osgi.org/services/osgi.enroute.io.circuit.api.html
