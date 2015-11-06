package com.cloudwick.generator.manufacturer

import scala.util.Random

class ManufacturerGenerator {
  val random = Random

  val category = Array(
    "Other Logic ICs","Keylock Switches","Photo Transistors","Rocker Switches","Analog to Digital Converters","Fiber Optic Switches","Fixed Resistors","FF/Latches","Power Management Circuits","TCVCXO, Sine","Multiplexers or Switches","RF Power Bipolar Transistors","Gates","Optoelectronic Accessories","Field Programmable Gate Arrays","Wires and Cables","Power Connectors","Pulse/Datacom Transformers","OCVCXO, Sine","Other Fiber Optics","Digital Transmission Controllers","RF/Microwave Modulator/Demodulators","Photo Resistives","Remote Control ICs","Military Circular Connectors","Timers or RTCs","Other Fiber Optic Connectors","Automotive Circuits","Other Trigger Devices","Secondary Storage Controllers","Photo Diodes","Paging Circuits","FIFOs","Voltage Controlled Sine SAW/STW Oscillators","Photovoltaic Cells","Other RF Connectors","Voltage Controlled Clock SAW Oscillators","Time Delay Relays","Fiber Optic Networking Connectors","Optocoupler - Transistor Outputs","Linear Position Sensors","Fixed Mixed Multiple Output Standard Regulators","Laser Diodes","Resistor/Capacitor Networks","Optical Position Encoders","Solid State Relays","RF Transformers","Adjustable Negative Single Output LDO Regulators","DIP Switches","Magnetic Field Sensors","Photo Trigger Devices","Arithmetic Circuits","Array/Network Capacitors","Optocoupler - Photocell Outputs","DRAMs","Gated Switches","Delay Lines","Multiway Rack and Panel Connectors","Shift Registers","OCVCXO, Clock","PIN Diodes","Tuner ICs","Fiber Optic Filters","Optocoupler - Trigger Device Outputs","Display Drivers","Fiber Optic Receivers","Fixed Positive Single Output LDO Regulators","IF Transformers","Fiber Optic Detectors","Small Signal Bipolar Transistors","Analog Waveform Generation Functions","Analog Transmission Interfaces","RF/Microwave Detectors","DSP Peripherals","Fiber Optic Biconic Connectors","Reed Relays","Multiplexer/Demultiplexers","Math Processors","Power/Mains Transformers","Microwave Mixer Diodes","Fiber Optic Emitters","Non Gated Switches","Adjustable Positive Single Output Standard Regulators","Bit-Slice Processors","Bus Controllers","PLL or Frequency Synthesis Circuits","Circular Connectors","SRAMs","Other Telecom ICs","Snap Acting/Limit Switches","XO, Sine","Deflection ICs","Fixed/Adjustable Positive Single Output Standard Regulators","Breakover Diodes","Comparators","SHV Connectors","Sockets and Chip Carriers","RF/Microwave Splitter/Combiners","Infrared LEDs","RF/Microwave Amplifiers","D Type Connectors","Tools and Machinery","RF/Microwave Mixers","Ceramic Filters","Optocoupler - IC Outputs","Other Oscillators","Slotted Switch - Logic Outputs","RF/Microwave Terminations","PCB Adapters","Graphics Processors","Fiber Optic ST Connectors","RF/Microwave Antennas","Visible LEDs","Other uPs/uCs/Peripheral ICs","Programmable Logic Devices","RF UHF Connectors","RF C Connectors","RF Blindmate Connectors","Reed Switches","Interrupt Controllers","Rectifier Diodes","Audio Transformers","Fixed Sine SAW/STW Oscillators","SAW Filters","SMPS Transformers","RF Small Signal Field-Effect Transistors","Analog Computational Functions","VCXO, Sine","Codecs","Programmable Unijunction Transistors","Fixed Inductors","RF SMA/SSMA Connectors","RF Relays","Other Transistors","Color Signal Converters","Peripheral Drivers","RF/Microwave Frequency Multipliers","Insulated Gate Bipolar Transistors","Other Memory ICs","Adjustable Mixed Multiple Output Standard Regulators","Other Optoelectronics","Silicon Controlled Switches","Microwave Special Purpose Diodes","RF N Connectors","Flash Memories","Mains Power Connectors","Audio/RCA Connectors","TCXO, Sine","Zener Diodes","OTP ROMs","Fiber Optic Transmitters","Special Switches","Telecom Signaling Circuits","Fiber Optic Circulator/Isolators","Telecom Filters","RF SC Connectors","Network Interfaces","Isolation Amplifiers","Fixed Positive Multiple Output LDO Regulators","Assembly Items","TRIACs","RF SMB/SSMB Connectors","RF/Microwave Phase Shifters","Heat Sinks","Displays","Clock Drivers","Other Switches","Fixed Mixed Multiple Output LDO Regulators","XO, Clock","SIDACs","Sample and Hold Circuits","Instrumentation Amplifiers","ATM/SONET/SDH ICs","Microprocessors","Fixed Gunn Oscillators","Fixed Clock SAW Oscillators","Signal Separator ICs","RF/Microwave Couplers","Other Circular Connectors","MOSFET Drivers","Other Rectangular Connectors","Power Supply Modules","Digital Signal Processors","Adjustable Positive Multiple Output LDO Regulators","Photo ICs","Silicon Surge Protectors","Level Translators","Tuned DRO/CRO","Special Capacitors","Power/Signal Relays","Decoder/Drivers","RF MCX/MMCX Connectors","RF/Microwave Limiters","Adjustable Negative Single Output Standard Regulators","EEPROMs","OCXO, Sine","Rectangular Adapters","Bus Driver/Transceivers","Fiber Optic Transceivers","Variacs","Fixed/Adjustable Negative Single Output Standard Regulators","Audio Synthesizer ICs","Audio/Video Amplifiers","Fixed/Adjustable Negative Single Output LDO Regulators","Cavity Filters","Thumb/Pushwheel Switches","Fiber Optic Modulators","Digital Transmission Support","Batteries","Fixed/Adjustable Positive Multiple Output Standard Regulators","Cellular Telephone Circuits","Data Line Filters","Digital Potentiometers","RF Twinax/Triax/Quadax Connectors","Step Recovery Diodes","Other Consumer ICs","Constant Voltage Transformers","RF/Microwave DC Blocks","Memory Management Units","Microcontrollers","Analog Special Function Converters","Fusible Resistors","Circuit Breaker","Other Interconnects","Fans/Blowers","Fiber Optic SMA Connectors","VCXO, Clock","Fiber Optic Wavelength Division Mux/Demux","General Purpose Filters","Display Controllers","Voltage References","Other Regulators","Fiber Optic FC Connectors","Limited Part Number Data","Non-linear Resistors","Cordless Telephone ICs","Stabistor Diodes","Tuned Gunn Oscillators","Variable Inductors","YIG Tuned Oscillators","Digital Transmission Interfaces","LED Displays","Fiber Optic SC Connectors","Clock ICs","Ceramic Resonators","Proximity Sensors","Cavity Oscillators","Other Analog ICs","PROMs","Fixed Positive Single Output Standard Regulators","Dielectric Resonators","Telecom Switching Circuits","Pressure Sensors","Keypad Switches","Current Regulator Diodes","Silicon Controlled Rectifiers","Operational Amplifiers","Combination Line Connectors","Special Relays","Power Bipolar Transistors","Motion Control Electronics","RF BNC Connectors","Voltage Controlled Oscillators","Fixed Positive Multiple Output Standard Regulators","Fiber Optic Attenuators","Slotted Switch - Transistor Outputs","TCXO, Clock","Headers and Edge Type Connectors","Prescaler/Multivibrators","Fixed/Adjustable Positive Multiple Output LDO Regulators","MASK ROMs","DMA Controllers","System Interface Logic ICs","OCXO, Clock","Crystal Filters","Fiber Optic Amplifiers","Other Interface ICs","Fuses","Superimposer ICs","RF/Microwave Isolator/Circulators","Tubular Filters","LCD Displays","Telecom Encryption Circuits","EPROMs","Noise Suppression ICs","Array/Network Resistors","Counters","Multifunction Peripherals","Rotary Position Sensors","Fixed Negative Single Output LDO Regulators","Auto Transformers","Fixed DRO/CRO","Toggle Switches","Adjustable Positive Multiple Output Standard Regulators","RF/Microwave Switches","Rotary Switches","Other Capacitors","Military Connector Accessories","Variable Resistors","Other Semiconductors","Position Converters","Unijunction Transistors","Fiber Optic Adapters","Current Sense Transformers","Bus Terminators","Transient Suppressors","SAW Resonators","Voltage Multiplier Diodes","DIN Connectors","Fixed Capacitors","Power Field-Effect Transistors","Pushbutton Switches","Inverter Transformers","Memory Controllers","Receiver ICs","null","Drive Electronics","Current Transformers","Parallel IO Ports","Buffer Amplifiers","Bridge Rectifier Diodes","Tunable Filters","Quartz Crystals","RF/Microwave Up/Down Converters","Audio Control ICs","Mains Filters","Temperature Sensors","Digital to Analog Converters","DC Power Plugs or Jacks","Serial IO/Communication Controllers","RF Power Field-Effect Transistors","RF TNC Connectors","Other Transformers","Other Passive Filters","Clock Generators","Fiber Optic Splitter/Couplers","RF Connectors","Other Relays","Telecom Transformers","Other Converters","Image Sensors","Fixed/Adjustable Positive Single Output LDO Regulators","Circular Adapters","Noise Generators","Other Sensors/Transducers","Duplexers","Other Resistors","Teletext ICs","Terminals and Terminal Blocks","Other Diodes","Small Signal Field-Effect Transistors","Active Filters","Slide Switches","Modems","Telecom and Datacom Connectors","RF Small Signal Bipolar Transistors","Infrared Sensors","Line Driver or Receivers","Fiber Optic Add/Drop Mux/Demux","Reflective Object Sensors","Varactors","Microprocessor Chipsets","TCVCXO, Clock","Fixed Negative Single Output Standard Regulators","RF Adapters","Telecom Protection Circuits","Adjustable Positive Single Output LDO Regulators","Switching Regulator or Controllers","DIACs","RF/Microwave Attenuators","Variable Capacitors","MOS Controlled Thyristors","Telephone Circuits","RF SMC/SSMC Connectors"
  )

  def categoryName = {
    category(random.nextInt(category.length))
  }

  def manufacturerPartNumber = {
    randomString(12)
  }

  def randomString(length: Int) = {
    Stream.continually(util.Random.nextPrintableChar()).take(length).mkString
  }
}