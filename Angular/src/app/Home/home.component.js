"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var core_1 = require('@angular/core');
var router_transition_1 = require('../router.transition/router.transition');
//import { ConsumerService } from '../Service/Services';
var homeComponent = (function () {
    function homeComponent() {
    }
    homeComponent.prototype.ngOnInit = function () { };
    homeComponent = __decorate([
        core_1.Component({
            selector: 'home',
            template: "\n       <h2 style=\"font-family: verdana\">Hello!</h2>\n              \n   \n            \n   \n  ",
            styleUrls: ['app/lib/css/styles.css'],
            animations: [router_transition_1.slideToRight()],
            host: { '[@slideToRight]': '' }
        }), 
        __metadata('design:paramtypes', [])
    ], homeComponent);
    return homeComponent;
}());
exports.homeComponent = homeComponent;
/*
    //constructor() { }
   // public imgLink = "http://38.media.tumblr.com/587f48c6548e640f943b7c8c6e3f40de/tumblr_mz8yzmi1XJ1ru39xmo1_500.gif";
   // ngOnInit() { }

//http://lorempixel.com/400/200
//<img [src] = "imgLink">

<ul *ngFor = "let employee of employees" style="font-family: verdana">
       <li>{{employee}}</li>
       </ul>
*/ 
//# sourceMappingURL=home.component.js.map