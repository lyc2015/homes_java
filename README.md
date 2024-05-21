# LYC Homes

## 1. 添加依赖

需要将 `jasperreports-fonts-6.10.0.jar` 文件添加到项目的 `/bin` 目录中。


## 2. 测试 API 端点

使用 Postman 或其他 API 测试工具来测试以下端点。

### 登录接口

**URL**: `http://localhost:8080/login/login`

**方法**: `POST`

**请求头**:

- `Content-Type: application/json`

**请求体**:

```json
{
  "employeeNo": "lyc001",
  "password": "1"
}
```

