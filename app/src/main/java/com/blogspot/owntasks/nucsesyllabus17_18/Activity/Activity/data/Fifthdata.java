package com.blogspot.owntasks.nucsesyllabus17_18.Activity.Activity.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Mahbub on 25-Mar-18.
 */

public class Fifthdata {
    public static HashMap<String, List<String>> getDatafi() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> pai = new ArrayList<String>();
        pai.add("INTERFACING: Interfacing basics: Peripheral devices, adapters, Data highway, I/O operations. Interrupts basics, types, priority. and the interrupt controllers- Daisy chain configuration, 8259A. DMA basics and the 8237 DMA controller. Buses: AGP, PCI and PCI express, USB, SCSI. Digital Interfacing: Digital Interfacing basics and the ProgrammableParallelPort 8255A. Interfacing, Keyboard and Alpha-numeric Display Interfacing.high power devices. Interfacing microcomputer ports to stepper motor and high power devices. Optical motor shaft encoders. Analog Interfacing: D/A (simple and R-2R ladder circuits) and A/D (parallel, successive approximation and Dual-slope circuits) converters, properties and interfacing, interfacing with different sensors. PERIPHERALS DEVICES: Different types of sensors and transducers. Interfacing with Devices: Different Mouse, Joystick, Scanner, Light, Pen, Touch Screen, OMR, OCR, Barcode Reader. Magnetic and Optical disk storage. Keyboard switches, Light Emitting Diodes, CRT and LCD displays, Laser printers: organization, working principle and properties.");


        List<String> datt = new ArrayList<String>();
        datt.add("Data communication model: TCP/IP and OSI; data communication network components; different types of networks: circuit switching, packet switching networks, ATM, HDLC and X.25; signal and random processes; review of Fourier transformation and Hilbert transformation; Introduction to modulation techniques; continuous wave modulation: AM, PM, FM; sampling theorem; pulse modulation: PAM, PDM, PPM, PCM; companding; delta modulation; different PCM; multiple access techniques: TDM, FDM; quantization; digital modulation: ASK, FSK, PSK, BPSK, QPSK; constellation; bit error rate (BER), noise; echo cancellation; intersymbol interference; probability of error for pulse systems; concepts of channel coding and capacity; asynchronous and synchronous communications; hardware interfaces, multiplexers, concentrators and buffers; communication media; fiber optics; wireless transmission: propagation, path loss, fading, delay spread; spread spectrum: frequency hopping spread spectrum and direct sequence spread spectrum; CDMA; High speed digital access: DSL, SONET, SDH; error detection and correction techniques: parity check, CRC, block code and hamming code; flow and error control techniques: sliding window, stop and wait, ARQ and HDLC protocols; modes of communications: simplex, half-duplex and full duplex.");

        List<String> os = new ArrayList<String>();
        os.add("Introduction: Operating system overview, computer system structure, structure and components of an operating system. System calls: class of system calls and description. Process and threads: process and thread model, process and thread creation and termination, user and kernel level thread, scheduling, scheduling algorithms, dispatcher, context switch, real time scheduling. Concurrency and synchronization: IPC and inter-thread communication, critical region, critical section problems and solutions. Resource management: introduction to deadlock, ostrich algorithm, deadlock detection and recovery, deadlock avoidance, deadlock prevention, starvation. File management: File Naming and structure, file access and attributes, system calls, file organization: OS and user perspective view of file, memory mapped file, file directories organization, File System Implementation: implementing file, allocation strategy, method of allocation, directory implementation, UNIX i-node, block management, quota. Memory management: basic memory management, fixed and dynamic partition, virtual memory, segmentation, paging and swapping, MMU. Virtual memory management: paging, page table structure, page replacement, TLB, exception vector, demand paging and segmentation, thrashing and performance. Disk I/O management: structure, performance, low-level disk formatting, Disk arm scheduling algorithm, error handling, stable storage.");

        List<String> pail = new ArrayList<String>();
        pail.add("The key objective of the course is to introduce the students with different peripheral devices (LED, 7-segment display, 16x2 LCD display, stepper motor, DC motor, servo motor, etc), Sensors (Temperature sensor,light sensors, etc.) and interfacing. Besides, students will be introduced how those devices are interfaced and controlled from computer. After completing the course, students will be able to control any peripheral devices from computer through computer’s parallel port. Students will be introduced with various micro controllers (PIC 16F84,ATMEL etc) and they will be able to design micro controller based small embedded systems.");

        List<String> datl = new ArrayList<String>();
        datl.add("Laboratory classes are based on the course CSE 530203. Upon successful completion of this laboratory, students should have knowledge about various communication protocols in physical layers, be able to identify different transmission media based on their characteristics and can apply different signal encoding schemes and analyze their performance. They can handle different error detection and error control mechanism as well as different flow control mechanism and quantitatively analyze their performance. Having experience on serial communication, they can" +
                "also implement the NULL modem communication. They can also use different types of multiplexing in a real or simulated environment.");

        List<String> osl = new ArrayList<String>();
        osl.add("Lab based on the courseCSE 530205. Source code of OS161 operating system and required tools developed by Harvard University, based on R3000 architecture will be used in the lab. Students will be asked to add operating system module such as memory management, system call, file system, drivers etc. In the lab for such modules problems will defined elaborately. The laboratory also train students in debugging using gdb based on R3000.");


        List<String> eco = new ArrayList<String>();
        eco.add("Introduction: Definition, Microeconomics vs. macroeconomics, scope of economics, meaning of economic theory, some basic concepts- product, commodity, want, utility, consumption, factors of production. Demand: Law of demand, factors determining demand, shifts in demand, demand functions, deriving demand curves, substitution and income effects, deriving aggregate demands, various concepts of demand elasticity and measurements, discussion on the method of estimating demand functions and demand functions and demand forecasting. Supply: Law of supply and supply function, determination of supply, shifts in supply, elasticity of supply, market equilibrium. Economic Theory of Consumer Behavior: reasons for consumption, Principle of diminishing marginal utility, indifference Curves, Budget Constraint, Utility Maximization and Consumer Equilibrium. Consumer Demand: Change in Budget Constraints, Price Consumption Curve, Income Consumption Curve, Consumer Demand, market Demand, Engel Curve. Production: Production functions, total, average and marginal products, law of diminishing marginal physical products, production isoquants, marginal rate of technical substitution (MRTS), optimal combination of inputs, expansion path, returns to scale, estimation of production function and estimation of cost function. Cost: concepts of cost, short-run costs, relation between short-run costs and production, long run costs, economies and diseconomies of scale, relation between short run and long run costs, cost function and estimation of cost function. Markets and Revenue: Meaning of market, different forms of market, concepts of total, average and marginal revenue, relation between average revenue and marginal revenue curves, relation between different revenues and elasticity’s of demand, equilibrium of the firm. Price and Output: Price and output determination under perfect competition, monopoly, monopolistic competition and oligopoly, profit maximization, price discrimination, plant shut down decision, barriers to entry.");


        //7
        expandableListDetail.put("Peripheral and Interfacing", pai);
        //2
        expandableListDetail.put("Data and Telecommunications", datt);
        //4
        expandableListDetail.put("Operating System", os);
        //6
        expandableListDetail.put("Peripheral and Interfacing Lab", pail);
        //1
        expandableListDetail.put("Data and Telecommunications Lab", datl);
        //5
        expandableListDetail.put("Operating System Lab", osl);
        //3
        expandableListDetail.put("Economics", eco);
        return expandableListDetail;
    }
}

