import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ActiveComponent } from './active/active.component';
import { InactiveComponent } from './inactive/inactive.component';
import { UsersComponent } from './users/users.component';

const routes: Routes = [
  {
    path: 'active',
    component: ActiveComponent
  },
  {
    path: 'inactive',
    component: InactiveComponent
  },
  {
    path: 'users',
    component: UsersComponent
  },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
