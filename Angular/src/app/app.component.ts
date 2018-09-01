import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template: `
   <header></header>
 <ul id="menu">
       <li id="lis"><a routerLink="/home" routerLinkActive="active">Home</a></li>
       <li id="lis"><a routerLink="/app-title" routerLinkActive="active">List</a></li>
  </ul>
  <router-outlet></router-outlet>
 
  `,
    styleUrls: ['./home-styles.css']
})
export class AppComponent {
  title = 'NewtonX Angular Assessment';
}
