# Smart Device RESTful API

This project implements a **Spring Boot REST API** to simulate controlling smart devices in a home or IoT environment. It allows users to turn devices on/off, check their status, and update their settings.

---

## 🚀 Features

* List all devices
* Turn a device **ON** or **OFF**
* Check the **status** of a device
* Update device **settings** (key-value pairs)

---

## 🧠 API Endpoints

| Method | Endpoint                 | Description                   |
| ------ | ------------------------ | ----------------------------- |
| GET    | `/devices`               | List all smart devices        |
| GET    | `/devices/{id}`          | Get the status of a device    |
| PUT    | `/devices/{id}/on`       | Turn ON the device            |
| PUT    | `/devices/{id}/off`      | Turn OFF the device           |
| PUT    | `/devices/{id}/settings` | Update settings of the device |

---

## 🧪 Test Using Postman

### Turn ON device `101`

```
PUT http://localhost:8080/devices/101/on
```

Response:

```
"Device 101 is now ON"
```

### Turn OFF device `101`

```
PUT http://localhost:8080/devices/101/off
```

### Check device status

```
GET http://localhost:8080/devices/101
```

### Update settings

```
PUT http://localhost:8080/devices/101/settings
Headers:
  Content-Type: application/json
Body:
  {
    "volume": "80",
    "mode": "eco"
  }
```

---

## 🛠 Built With

* Java 17
* Spring Boot 3.x
* Maven

---

## 📚 References

* Nic Lughadha, C. (2025). *REST*. Distributed Systems \[PowerPoint presentation]. Dublin: Higher Diploma in Science in Computing.
* Nabto. (n.d.). *REST API for IoT: The complete guide*. [https://www.nabto.com/rest-api-iot-guide/](https://www.nabto.com/rest-api-iot-guide/)
* Manikandan, A. and Sakthivel, S. (2023). *Design and Implementation: RESTful API for IoT-Based Smart Home Systems*. ResearchGate.

---

## 📂 Folder Structure

```
src/main/java/com/example/smartdevice/
├── controller/
│   └── DeviceController.java
├── model/
│   └── Device.java
├── service/
│   └── DeviceService.java
└── SmartDeviceApplication.java
```

---

## ✨ Author

**Adrian Jandongan** — Built for Higher Diploma in Computing - Distributed Systems (TABA 2025)

---

Feel free to fork, test, or expand it to connect with real IoT hardware!
