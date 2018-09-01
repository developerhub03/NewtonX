"use strict";
var router_1 = require('@angular/router');
var marketer_component_1 = require('../marketer/marketer.component');
var consumer_component_1 = require('../consumer/consumer.component');
var supplier_component_1 = require('../supplier/supplier.component');
var product_component_1 = require('../product/product.component');
var supplier_product_component_1 = require('../supplier_product/supplier_product.component');
var marketer_product_component_1 = require('../marketer_product/marketer_product.component');
var home_component_1 = require('../Home/home.component');
//import { EmployeeService } from '../Service/Services';
var appRoutes = [
    { path: '', redirectTo: 'home', pathMatch: 'full' },
    { path: 'home', component: home_component_1.homeComponent },
    { path: 'consumer', component: consumer_component_1.consumerComponent },
    { path: 'supplier', component: supplier_component_1.supplierComponent },
    { path: 'marketer', component: marketer_component_1.marketerComponent },
    { path: 'product', component: product_component_1.productComponent },
    { path: 'supplierP', component: supplier_product_component_1.supplierPComponent },
    { path: 'marketerP', component: marketer_product_component_1.marketerPComponent }
];
exports.appRoutingProviders = [];
exports.routing = router_1.RouterModule.forRoot(appRoutes, {
    useHash: true
});
//# sourceMappingURL=app.routes.js.map