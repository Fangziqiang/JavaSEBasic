# HzcxApi.HzcxApiApi
公司API

* 默认域名：
service-94vz3buz-1251363375.ap-beijing.apigateway.myqcloud.com/release
* 自定义域名：
api.aiinp.com/
test.aiinp.com/
yancc.aiinp.com/


All URIs are relative to *http://service-94vz3buz-1251363375.ap-beijing.apigateway.myqcloud.com/release*

# SDK文档目录
* 一、API列表
* 二、API调用
   * 1.公共入参
   * 2.鉴权方式
   * 3.API详细信息
* 三、更多信息

# 一、API列表

API名称 | HTTP 请求方法与路径 | 描述
------------- | ------------- | -------------
**getEchostr** | **GET** /echo/{str} | 
**getWxTemplateList** | **GET** /wx/template/list | 
**getXMicroServiceNameXNameSpaceCodeEchostr** | **GET** /{X-MicroService-Name}/{X-NameSpace-Code}/echo/{str} | 
**postXMicroServiceNameXNameSpaceCodeWxNotify** | **POST** /{X-MicroService-Name}/{X-NameSpace-Code}/wx/notify | 


# 二、API调用
## 1.公共入参
公共入参是指每个接口都需要使用到的请求参数。

| 参数名称       | 位置   | 必须 | 描述 |
| -------------- | ------ | ---- | ---------------------------------------- |
| Date           | Header | 是   | GMT 格式的 http 请求构造时间 |
| Authorization  | Header | 是   | 根据签名计算规则构造的串，用于身份认证，详细格式与内容可参考：签名计算规则 |
| Source         | Header | 否   | 发起 http 请求的设备类型 |


## 2.鉴权方式
### 2.1 密钥对
如果您调用的此API为密钥对验证方式，请在调用时的提前修改client_package/api/*_api.py中的secretId/secretkey (默认为空)


### 2.2 Oauth2.0
如果您调用的此API为绑定了oauth2.0验证方式的业务API,请先调用此业务API绑定的授权API,通过授权API返回的响应信息构造Authorization参数.
因此您需要做的：
  (1)从认证服务器处获取授权码code(腾讯云API网关不参与您与AS的认证过程)
  (2)调用与业务API绑定的授权API，本文档会指明每个业务API关联的授权API,调用授权API时请构造好code参数(code的值为您通过认证服务器获取的授权码)
  (3)通过授权API返回的token信息，构造调用业务API时的token参数
  	token值对应的header参数名是 cookie或者authorization  (由创建授权api时的 “后端设置-Token携带位置” 决定)
	两种header参数格式如下：
	1.cookie='id_token=xxx.xxx.xxx'
	2.authorization='Authorization:Bearer id_token="xxx.xxx.xxx"'


## 3.API详细信息
# **API名称：getEchostr**
> getEchostr(str, xMicroServiceName, xNameSpaceCode)
> returnType: 'String' 

## 描述


## 请求信息
调用地址：http://service-94vz3buz-1251363375.ap-beijing.apigateway.myqcloud.com/release/echo/{str}
方法：GET

## 请求参数

名称 | 类型 | 描述  | 必填  | 默认值
------------- | ------------- | ------------- | ------------- | -------------
 **str** | **String**|  | 是 | 无
 **xMicroServiceName** | **String**| 默认参数，调用时需传入所需路由的命名空间 | 是 | 
 **xNameSpaceCode** | **String**| 默认参数，调用时需传入所需路由的微服务 | 是 | 

## 返回信息

### 返回参数类型

**'String'**

### 失败响应示例
```

```
### 成功响应示例
```

```

## 错误码

错误码 | 错误信息&描述
------------- | -------------
 **200** | OK


## 鉴权
此api无任何认证方式，请直接调用



## Example
```javascript
var HzcxApi = require('hzcx_api');

var apiInstance = new HzcxApi.HzcxApiApi();

var str = "str_example"; // String | 

var xMicroServiceName = ""; // String | 默认参数，调用时需传入所需路由的命名空间

var xNameSpaceCode = ""; // String | 默认参数，调用时需传入所需路由的微服务


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getEchostr(str, xMicroServiceName, xNameSpaceCode, callback);
```

# **API名称：getWxTemplateList**
> getWxTemplateList(xMicroServiceName, xNameSpaceCode)
> returnType: 'String' 

## 描述


## 请求信息
调用地址：http://service-94vz3buz-1251363375.ap-beijing.apigateway.myqcloud.com/release/wx/template/list
方法：GET

## 请求参数

名称 | 类型 | 描述  | 必填  | 默认值
------------- | ------------- | ------------- | ------------- | -------------
 **xMicroServiceName** | **String**| 默认参数，调用时需传入所需路由的命名空间 | 是 | 
 **xNameSpaceCode** | **String**| 默认参数，调用时需传入所需路由的微服务 | 是 | 

## 返回信息

### 返回参数类型

**'String'**

### 失败响应示例
```

```
### 成功响应示例
```

```

## 错误码

错误码 | 错误信息&描述
------------- | -------------
 **200** | OK


## 鉴权
此api为秘钥对验证



## Example
```javascript
var HzcxApi = require('hzcx_api');

var apiInstance = new HzcxApi.HzcxApiApi();

var xMicroServiceName = ""; // String | 默认参数，调用时需传入所需路由的命名空间

var xNameSpaceCode = ""; // String | 默认参数，调用时需传入所需路由的微服务


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getWxTemplateList(xMicroServiceName, xNameSpaceCode, callback);
```

# **API名称：getXMicroServiceNameXNameSpaceCodeEchostr**
> getXMicroServiceNameXNameSpaceCodeEchostr(str, xMicroServiceName, xNameSpaceCode)
> returnType: 'String' 

## 描述


## 请求信息
调用地址：http://service-94vz3buz-1251363375.ap-beijing.apigateway.myqcloud.com/release/{X-MicroService-Name}/{X-NameSpace-Code}/echo/{str}
方法：GET

## 请求参数

名称 | 类型 | 描述  | 必填  | 默认值
------------- | ------------- | ------------- | ------------- | -------------
 **str** | **String**|  | 是 | 无
 **xMicroServiceName** | **String**| 默认参数，调用时需传入所需路由的命名空间 | 是 | 无
 **xNameSpaceCode** | **String**| 默认参数，调用时需传入所需路由的微服务 | 是 | 无

## 返回信息

### 返回参数类型

**'String'**

### 失败响应示例
```

```
### 成功响应示例
```

```

## 错误码

错误码 | 错误信息&描述
------------- | -------------
 **200** | OK


## 鉴权
此api无任何认证方式，请直接调用



## Example
```javascript
var HzcxApi = require('hzcx_api');

var apiInstance = new HzcxApi.HzcxApiApi();

var str = "str_example"; // String | 

var xMicroServiceName = "xMicroServiceName_example"; // String | 默认参数，调用时需传入所需路由的命名空间

var xNameSpaceCode = "xNameSpaceCode_example"; // String | 默认参数，调用时需传入所需路由的微服务


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getXMicroServiceNameXNameSpaceCodeEchostr(str, xMicroServiceName, xNameSpaceCode, callback);
```

# **API名称：postXMicroServiceNameXNameSpaceCodeWxNotify**
> postXMicroServiceNameXNameSpaceCodeWxNotify(xMicroServiceName, xNameSpaceCode)
> returnType: 'String' 

## 描述


## 请求信息
调用地址：http://service-94vz3buz-1251363375.ap-beijing.apigateway.myqcloud.com/release/{X-MicroService-Name}/{X-NameSpace-Code}/wx/notify
方法：POST

## 请求参数

名称 | 类型 | 描述  | 必填  | 默认值
------------- | ------------- | ------------- | ------------- | -------------
 **xMicroServiceName** | **String**| 默认参数，调用时需传入所需路由的命名空间 | 是 | 无
 **xNameSpaceCode** | **String**| 默认参数，调用时需传入所需路由的微服务 | 是 | 无

## 返回信息

### 返回参数类型

**'String'**

### 失败响应示例
```

```
### 成功响应示例
```

```

## 错误码

错误码 | 错误信息&描述
------------- | -------------
 **200** | OK


## 鉴权
此api无任何认证方式，请直接调用



## Example
```javascript
var HzcxApi = require('hzcx_api');

var apiInstance = new HzcxApi.HzcxApiApi();

var xMicroServiceName = "xMicroServiceName_example"; // String | 默认参数，调用时需传入所需路由的命名空间

var xNameSpaceCode = "xNameSpaceCode_example"; // String | 默认参数，调用时需传入所需路由的微服务


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postXMicroServiceNameXNameSpaceCodeWxNotify(xMicroServiceName, xNameSpaceCode, callback);
```


# 三、更多信息
## 1.公共错误


| 错误代码                                     | http状态码 | 语义                                       | 解决方案                                     |
| ---------------------------------------- | ------- | ---------------------------------------- | ---------------------------------------- |
| Not Found Host                           | 404     | 请求中没有携带Host字段                            | 请求携带host字段，该字段值需要填服务器的域名，且为string类型      |
| Get Host Fail                            | 404     | 请求中携带的Host字段值并不是string类型                 | 将Host字段值改为string类型                       |
| Could not support method                 | 404     | 并不支持该请求方法类型                              | 检查请求方法是否合法                               |
| There is no api match host[$host]        | 404     | 找不到请求服务器域名/地址                            | 检查请求地址是否正确                               |
| There is no api match env_mapping[%env_mapping] | 404     | 自定义域名后的env_mapping字段错误                   | 检查绑定的自定义域名配置的env_mapping是否与自己填写的一致       |
| There is no api match default env_mapping[%env_mapping] | 404     | 默认域名后的env_mapping字段需要是test/prepub/release | 默认域名后的env_mapping字段需要是test/prepub/release |
| There is no api match uri[$uri]          | 404     | 在该请求地址对应的服务下找不到对应uri匹配的API               | 请检查uri填写是否正确                             |
| There is no api match method[$method]    | 404     | 在该请求地址+uri对应的API并不支持该请求方法                | 请检查请求方法是否正确                              |
| Not allow use HTTPS protocol或者Not allow use HTTP protocol | 404     | 该请求地址对应的服务并不支持对应HTTP协议类型                 | 请检查请求协议类型是否正确                            |
| req is cross origin, api $uri need open cors flag on qcloud apigateway. | 429     | 该请求是跨域请求，但对应的API并未打开跨域开关                 | 请打开该API的跨域开关                             |
| HMAC signature cannot be verified, a validate authorization header is required | 401     | 请求并未携带Authorization字段                    | 请根据文档API鉴权一章构造Authorization字段，或者参照demo构造该字段 |
| authorization headers is invalidate      | 403     | 请求Authorization字段格式不正确                   | 请根据文档API鉴权一章构造Authorization字段，或者参照demo构造该字段 |
| id or signature missing                  | 403     | 请求Authorization字段无id或者signature字段        | 请根据文档API鉴权一章构造Authorization字段，或者参照demo构造该字段 |
| HMAC signature cannot be verified, a valid $header header is required | 403     | 请求Authorization字段中的headers字段在请求header中找不到对应字段 | 请根据文档API鉴权一章构造Authorization字段，或者参照demo构造该字段 |
| HMAC signature cannot be verified, a valid date header is required | 403     | 请求Authorization必须需要使用date字段作为鉴权字段之一      | 请根据文档API鉴权一章构造Authorization字段，或者参照demo构造该字段 |
| Found no validate usage plan             | 403     | 请求鉴权失败，API需要鉴权，但该API并没有绑定使用计划            | 关闭该API的鉴权或者给该API所在的发布环境绑定使用计划，给该使用计划绑定apikey |
| HMAC signature cannot be verified        | 403     | 请求鉴权失败，Authorization字段中携带的key id并未绑定该API所在的发布环境，或者key id非法，或者该key被禁用 | 请检查该APIkey是否可用该APIKEY是否绑定对应使用计划/发布环境     |
| HMAC signature does not match            | 403     | 请求鉴权失败，计算出来的hmac值并不一致，请重新检查并计算。          | 计算的hmac值错误，请根据文档API鉴权一章构造Authorization字段，或者参照demo构造该字段 |

## 2.secretId/secretkey签名详细计算规则如下
为了保护您的 API，避免恶意访问、未授权访问、应用漏洞、黑客攻击等导致的数据损失、资产损失，API网关提供了 [secret_id + secret_key 认证](https://cloud.tencent.com/document/product/628/11819) 方式。

您可以使用 secret_id 和 secret_key 对您的 API 进行认证管理。secret_id 和 secret_key 成对出现，这里将它们称为 secret_id/secret_key 对。

在使用 secret_id/secret_key 对认证前，您需要先在[腾讯云API网关管理控制台](https://console.cloud.tencent.com/apigateway/key?rid=1)创建好一对 secret_id 和 secret_key。

在服务发布并选择发布服务的认证方式时，您可以选定使用 secret_id + secret_key 认证，然后在 secret_id/secret_key 对的选择处选择已经创建好的 secret_id/secret_key 对。

一对 secret_id/secret_key 可用于多个已发布的服务，一个已发布的服务也可以选择使用多个 secret_id/secret_key 对。

使用 secret_id + secret_key 完成认证的方式如下：

#### 密钥内容

先创建并准备好一对秘钥，密钥内容如下：

- **secret_id**：举例 AKIDCgOPWjQ6BAxvHtyckhWABJVYSBj548pN 

  用于标识所使用的哪个密钥，并参与签名计算，传输过程中体现。

- **secret_key**：举例 ZxF2whO0RhuwnVCj5JMMAuqcDcN2oPrC 

  用于签名计算，传递过程中无体现。

### 计算方法

#### 最终发送内容

最终发送的 http 请求内至少包含两个 header：**Date** 和 **Authorization**，可以包含更多 header。

Date header 的值为 GMT 格式的 http 请求构造时间，例如 Fri, 09 Oct 2015 00:00:00 GMT。

Authorization header 的形如 `Authorization: hmac id="secret_id", algorithm="hmac-sha1", headers="date source", signature="Base64(HMAC-SHA1(signing_str, secret_key))"`。

现对 Authorization 内的各部分分别解释：

- hmac：固定内容，用于标识计算方法。
- id：其值为密钥内的 secret_id 的值。
- algorithm：加密算法，当前支持的是 hmac-sha1。
- headers：参与签名计算的 header，按实际计算时的顺序排列。
- signature：计算签名后得到的签名。

#### 签名计算方法

签名由两部分并根据指定加密算法进行计算，以 hmac-sha1 算法举例：

**1. 签名内容**
首先生成签名内容，签名内容由自定义的 header 组成，header 内建议至少包含 date，可以包含更多其他 header。

header 按如下要求转换后按顺序排列：

- header 名转换为小写，跟上 **ascii冒号字符** 和 **ascii空格字符**。
- 然后附加 header 值。
- 如果不是最后一条需构造签名的 header，附上 **ascii换行字符\n**。

例如有两个 header 参与构建签名内容：

```
Date:Fri, 09 Oct 2015 00:00:00 GMT
Source:AndriodApp
```

生成的签名内容为：

```
date: Fri, 09 Oct 2015 00:00:00 GMT\nsource: AndriodApp
```

**2. 计算签名**
将上一步生成的签名内容，使用 Base64(HMAC-SHA1(signing_str, secret_key)) 算法进行计算生成签名，也就是：

- 使用签名内容作为输入信息，密钥内的 secret_key 内容作为密钥，使用 HMAC-SHA1 算法进行计算得出加密签名内容。

- 使用 Base64 对算出的加密签名内容进行转换生成可传递的签名内容。

**3. 使用签名**

  如 *最终发送内容* 中所示的一样，在 Authorization header 的 signature 处填入上一步计算完成后的签名。

### 注意事项

#### header对应

Authorization 中 headers 位置填入的需要是参与计算签名的 header 的名称，并建议转换为小写，以 ascii 空格分隔。

#### 签名内容生成

排列内容时，请注意 header 名后面跟的冒号和空格，如有遗失也可能导致校验无法通过。


