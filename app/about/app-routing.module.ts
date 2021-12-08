import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutComponent } from './about/about.component';
import { LaptopComponent } from './about/laptop/laptop.component';
import { MobileComponent } from './about/mobile/mobile.component';
import { ChineseComponent } from './chinese/chinese.component';
import { ErrorComponent } from './error/error.component';
import { FastComponent } from './fast/fast.component';
import { IndianComponent } from './indian/indian.component';

const routes: Routes = [
  {path:'about',component:AboutComponent,children:[
    {path: 'laptop',component:LaptopComponent},
    {path:'mobile',component:MobileComponent}
  ]},
  {path:'indian',component:IndianComponent},
  {path:'chinese',component:ChineseComponent},
  {path:'fast',component:FastComponent},
  {path:'**',component:ErrorComponent},
  {path:'mobile',component:MobileComponent}


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule { }
