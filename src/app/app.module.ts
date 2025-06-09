import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UsuarioListComponent } from './components/usuario-list/usuario-list.component';
import { CategoriaListComponent } from './components/categoria-list/categoria-list.component';
import { HabilidadServicioListComponent } from './components/habilidad-servicio-list/habilidad-servicio-list.component';
import { MatchesListComponent } from './components/matches-list/matches-list.component';
import { MensajeListComponent } from './components/mensaje-list/mensaje-list.component';
import { EvaluacionListComponent } from './components/evaluacion-list/evaluacion-list.component';
import { SubcategoriaListComponent } from './components/subcategoria-list/subcategoria-list.component';

@NgModule({
  declarations: [
    AppComponent,
    UsuarioListComponent,
    CategoriaListComponent,
    HabilidadServicioListComponent,
    MatchesListComponent,
    MensajeListComponent,
    EvaluacionListComponent,
    SubcategoriaListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
