package com.example.SPLab2.Services;

import com.example.SPLab2.Models.*;

public interface Visitor {
    void visitBook (Book b);
    void visitSection (Section s);
    void visitTableOfContents (TableOfContents toc);
    void visitParagraph (Paragraph p);
    void visitImageProxy (ImageProxy ip);
    void visitImage (Image i);
    void visitTable (Table t);
}
