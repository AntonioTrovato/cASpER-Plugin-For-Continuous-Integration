package it.unisa.casper.parser;

import it.unisa.casper.beans.PackageBean;

import java.util.List;

public interface Parser {
    List<PackageBean> parse() throws ParsingException;
}
