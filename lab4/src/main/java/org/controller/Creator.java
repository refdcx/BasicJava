package org.controller;
import org.model.*;


interface Creator<T> {
    T create(String name, Human head);
}
