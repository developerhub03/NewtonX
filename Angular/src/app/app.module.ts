import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { TitleComponent } from './title/title.component';
import { homeComponent } from './Home/home.component';
import { FormsModule} from '@angular/forms'
import { routing, appRoutingProviders } from './routes/app.routes';
@NgModule({
  declarations: [
    AppComponent,
    TitleComponent,homeComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,routing
  ],
  providers: [appRoutingProviders],
  bootstrap: [AppComponent]
})
export class AppModule { }
