'use strict';

const express = require('express');
const Eureka = require('eureka-js-client').Eureka;
var randomName = require('node-random-name');

// Constants
const PORT = 3000;
const HOST = '0.0.0.0';
const app = express();


// example configuration
const client = new Eureka({
  // application instance information
  instance: {
    app: 'project_node',
    hostName: "localhost_" + Math.random(),
    ipAddr: 'localhost',
    statusPageUrl: 'http://localhost:3000',
    vipAddress: 'project_node',
    port: {
      $: PORT,
      '@enabled': 'true',
    },
    dataCenterInfo: {
      '@class': 'com.netflix.appinfo.InstanceInfo$DefaultDataCenterInfo',
      name: 'MyOwn',
    },
    registerWithEureka: true,
    fetchRegistry: true,
  },
  eureka: {
    // eureka server host / port
    host: 'discovery-service',
    port: 8082,
    servicePath: '/eureka/apps/',
  },
});

client.logger.level('debug');
client.start(error => {
  console.log(error || 'NodeJS Eureka Started!');
  app.get('/', (req, res) => {
    res.send('Hello from NodeJS Eureka Client\n');
    res.end();
  });
});

app.listen(PORT, HOST);
console.log(`Running on http://${HOST}:${PORT}`);
