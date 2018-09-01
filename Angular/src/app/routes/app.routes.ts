import { ModuleWithProviders } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { homeComponent } from '../Home/home.component';
import { TitleComponent } from '../title/title.component';


//import { EmployeeService } from '../Service/Services';
const appRoutes: Routes = [
    { path: '', redirectTo: 'home', pathMatch: 'full' },
    { path: 'home', component: homeComponent },
    { path: 'app-title', component: TitleComponent }
];

export const appRoutingProviders: any[] = [];

export const routing: ModuleWithProviders = RouterModule.forRoot(appRoutes,
 {
     useHash: true
 });