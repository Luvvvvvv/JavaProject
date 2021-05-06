const express = require('express');
const app = express();
app.get('/server', (request, response) => {
  //设置响应头，允许跨域
  response.setHeader('Access-Control-Allow-Origin', '*')
  response.send('hello ajax i');
});


app.all('/json-server', (request, response) => {
  //设置响应头，允许跨域
  response.setHeader('Access-Control-Allow-Origin', '*')

  response.setHeader('Access-Control-Allow-Header', '*')

  const data = {
    name: 'luvvhonvv'
  };
  let str = JSON.stringify(data);

  response.send(str);
});


app.all('/jquery-server', (request, response) => {
  //设置响应头，允许跨域
  response.setHeader('Access-Control-Allow-Origin', '*')

  const data = {
    name: 'luvvhonvv'
  };
  let str = JSON.stringify(data);

  response.send(str);
});

app.listen(8000, () => {
  console.log('服务已启动');
});