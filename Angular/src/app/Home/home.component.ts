import { Component, OnInit, HostBinding } from '@angular/core';
import { slideToRight } from '../router.transition/router.transition';
@Component({
  selector: 'home',
  template: `
       <h2 id="yes">Welcome to NewtonX Assessment</h2>
       <marquee behavior="scroll" direction="left" style="color:Black; font-size: 40px; font-family:serif;">Click on the List button to add List</marquee>
              
   
            
   
  `,
  styleUrls: ['../home-styles.css'],
})
export class homeComponent implements OnInit {
    constructor() { }

    ngOnInit() { }
}
