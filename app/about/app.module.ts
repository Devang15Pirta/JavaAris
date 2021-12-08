import { Component, NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule, Routes } from '@angular/router';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HighlightDirective } from './highlight.directive';
import { NeedDataService } from './need-data.service';
import { AboutComponent } from './about/about.component';
import { IndianComponent } from './indian/indian.component';
import { ChineseComponent } from './chinese/chinese.component';
import { FastComponent } from './fast/fast.component';
import { ErrorComponent } from './error/error.component';
import { MobileComponent } from './about/mobile/mobile.component';
import { LaptopComponent } from './about/laptop/laptop.component';
import { LandingComponent } from './landing/landing.component';
import { HttpClientModule} from '@angular/common/http'
const appRoutes:Routes=[]
@NgModule({
  declarations: [
    AppComponent,
    HighlightDirective,
    AboutComponent,
    IndianComponent,
    ChineseComponent,
    FastComponent,
    ErrorComponent,
    MobileComponent,
    LaptopComponent,
    LandingComponent,
    HttpClientModule

    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule
  ],
  providers: [NeedDataService],
  bootstrap: [AppComponent]
})
export class AppModule { }
