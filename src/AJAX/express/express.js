const express = require('express');
const app = express();
app.get('/', (request, response) => {
  response.send('hello express');
});

app.listen(8000, () => {
  console.log('服务已启动');
})