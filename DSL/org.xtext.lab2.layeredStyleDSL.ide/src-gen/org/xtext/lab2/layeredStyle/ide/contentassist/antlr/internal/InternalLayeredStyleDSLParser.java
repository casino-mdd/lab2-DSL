package org.xtext.lab2.layeredStyle.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.lab2.layeredStyle.services.LayeredStyleDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLayeredStyleDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AllowedToUse'", "'AllowedToUseBelow'", "'layer'", "'{'", "'}'", "'segment'", "'relation'", "'type'", "':'", "'source'", "'target'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalLayeredStyleDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLayeredStyleDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLayeredStyleDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLayeredStyleDSL.g"; }


    	private LayeredStyleDSLGrammarAccess grammarAccess;

    	public void setGrammarAccess(LayeredStyleDSLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleLayeredStyle"
    // InternalLayeredStyleDSL.g:53:1: entryRuleLayeredStyle : ruleLayeredStyle EOF ;
    public final void entryRuleLayeredStyle() throws RecognitionException {
        try {
            // InternalLayeredStyleDSL.g:54:1: ( ruleLayeredStyle EOF )
            // InternalLayeredStyleDSL.g:55:1: ruleLayeredStyle EOF
            {
             before(grammarAccess.getLayeredStyleRule()); 
            pushFollow(FOLLOW_1);
            ruleLayeredStyle();

            state._fsp--;

             after(grammarAccess.getLayeredStyleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLayeredStyle"


    // $ANTLR start "ruleLayeredStyle"
    // InternalLayeredStyleDSL.g:62:1: ruleLayeredStyle : ( ( rule__LayeredStyle__ElementsAssignment )* ) ;
    public final void ruleLayeredStyle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:66:2: ( ( ( rule__LayeredStyle__ElementsAssignment )* ) )
            // InternalLayeredStyleDSL.g:67:2: ( ( rule__LayeredStyle__ElementsAssignment )* )
            {
            // InternalLayeredStyleDSL.g:67:2: ( ( rule__LayeredStyle__ElementsAssignment )* )
            // InternalLayeredStyleDSL.g:68:3: ( rule__LayeredStyle__ElementsAssignment )*
            {
             before(grammarAccess.getLayeredStyleAccess().getElementsAssignment()); 
            // InternalLayeredStyleDSL.g:69:3: ( rule__LayeredStyle__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13||LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLayeredStyleDSL.g:69:4: rule__LayeredStyle__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__LayeredStyle__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getLayeredStyleAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLayeredStyle"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalLayeredStyleDSL.g:78:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // InternalLayeredStyleDSL.g:79:1: ( ruleAbstractElement EOF )
            // InternalLayeredStyleDSL.g:80:1: ruleAbstractElement EOF
            {
             before(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getAbstractElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalLayeredStyleDSL.g:87:1: ruleAbstractElement : ( ( rule__AbstractElement__Alternatives ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:91:2: ( ( ( rule__AbstractElement__Alternatives ) ) )
            // InternalLayeredStyleDSL.g:92:2: ( ( rule__AbstractElement__Alternatives ) )
            {
            // InternalLayeredStyleDSL.g:92:2: ( ( rule__AbstractElement__Alternatives ) )
            // InternalLayeredStyleDSL.g:93:3: ( rule__AbstractElement__Alternatives )
            {
             before(grammarAccess.getAbstractElementAccess().getAlternatives()); 
            // InternalLayeredStyleDSL.g:94:3: ( rule__AbstractElement__Alternatives )
            // InternalLayeredStyleDSL.g:94:4: rule__AbstractElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleLayer"
    // InternalLayeredStyleDSL.g:103:1: entryRuleLayer : ruleLayer EOF ;
    public final void entryRuleLayer() throws RecognitionException {
        try {
            // InternalLayeredStyleDSL.g:104:1: ( ruleLayer EOF )
            // InternalLayeredStyleDSL.g:105:1: ruleLayer EOF
            {
             before(grammarAccess.getLayerRule()); 
            pushFollow(FOLLOW_1);
            ruleLayer();

            state._fsp--;

             after(grammarAccess.getLayerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLayer"


    // $ANTLR start "ruleLayer"
    // InternalLayeredStyleDSL.g:112:1: ruleLayer : ( ( rule__Layer__Group__0 ) ) ;
    public final void ruleLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:116:2: ( ( ( rule__Layer__Group__0 ) ) )
            // InternalLayeredStyleDSL.g:117:2: ( ( rule__Layer__Group__0 ) )
            {
            // InternalLayeredStyleDSL.g:117:2: ( ( rule__Layer__Group__0 ) )
            // InternalLayeredStyleDSL.g:118:3: ( rule__Layer__Group__0 )
            {
             before(grammarAccess.getLayerAccess().getGroup()); 
            // InternalLayeredStyleDSL.g:119:3: ( rule__Layer__Group__0 )
            // InternalLayeredStyleDSL.g:119:4: rule__Layer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Layer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLayer"


    // $ANTLR start "entryRuleLayerSegment"
    // InternalLayeredStyleDSL.g:128:1: entryRuleLayerSegment : ruleLayerSegment EOF ;
    public final void entryRuleLayerSegment() throws RecognitionException {
        try {
            // InternalLayeredStyleDSL.g:129:1: ( ruleLayerSegment EOF )
            // InternalLayeredStyleDSL.g:130:1: ruleLayerSegment EOF
            {
             before(grammarAccess.getLayerSegmentRule()); 
            pushFollow(FOLLOW_1);
            ruleLayerSegment();

            state._fsp--;

             after(grammarAccess.getLayerSegmentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLayerSegment"


    // $ANTLR start "ruleLayerSegment"
    // InternalLayeredStyleDSL.g:137:1: ruleLayerSegment : ( ( rule__LayerSegment__Group__0 ) ) ;
    public final void ruleLayerSegment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:141:2: ( ( ( rule__LayerSegment__Group__0 ) ) )
            // InternalLayeredStyleDSL.g:142:2: ( ( rule__LayerSegment__Group__0 ) )
            {
            // InternalLayeredStyleDSL.g:142:2: ( ( rule__LayerSegment__Group__0 ) )
            // InternalLayeredStyleDSL.g:143:3: ( rule__LayerSegment__Group__0 )
            {
             before(grammarAccess.getLayerSegmentAccess().getGroup()); 
            // InternalLayeredStyleDSL.g:144:3: ( rule__LayerSegment__Group__0 )
            // InternalLayeredStyleDSL.g:144:4: rule__LayerSegment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LayerSegment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLayerSegmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLayerSegment"


    // $ANTLR start "entryRuleRelation"
    // InternalLayeredStyleDSL.g:153:1: entryRuleRelation : ruleRelation EOF ;
    public final void entryRuleRelation() throws RecognitionException {
        try {
            // InternalLayeredStyleDSL.g:154:1: ( ruleRelation EOF )
            // InternalLayeredStyleDSL.g:155:1: ruleRelation EOF
            {
             before(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_1);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getRelationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalLayeredStyleDSL.g:162:1: ruleRelation : ( ( rule__Relation__Group__0 ) ) ;
    public final void ruleRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:166:2: ( ( ( rule__Relation__Group__0 ) ) )
            // InternalLayeredStyleDSL.g:167:2: ( ( rule__Relation__Group__0 ) )
            {
            // InternalLayeredStyleDSL.g:167:2: ( ( rule__Relation__Group__0 ) )
            // InternalLayeredStyleDSL.g:168:3: ( rule__Relation__Group__0 )
            {
             before(grammarAccess.getRelationAccess().getGroup()); 
            // InternalLayeredStyleDSL.g:169:3: ( rule__Relation__Group__0 )
            // InternalLayeredStyleDSL.g:169:4: rule__Relation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleSubRelation"
    // InternalLayeredStyleDSL.g:178:1: entryRuleSubRelation : ruleSubRelation EOF ;
    public final void entryRuleSubRelation() throws RecognitionException {
        try {
            // InternalLayeredStyleDSL.g:179:1: ( ruleSubRelation EOF )
            // InternalLayeredStyleDSL.g:180:1: ruleSubRelation EOF
            {
             before(grammarAccess.getSubRelationRule()); 
            pushFollow(FOLLOW_1);
            ruleSubRelation();

            state._fsp--;

             after(grammarAccess.getSubRelationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubRelation"


    // $ANTLR start "ruleSubRelation"
    // InternalLayeredStyleDSL.g:187:1: ruleSubRelation : ( ( rule__SubRelation__Alternatives ) ) ;
    public final void ruleSubRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:191:2: ( ( ( rule__SubRelation__Alternatives ) ) )
            // InternalLayeredStyleDSL.g:192:2: ( ( rule__SubRelation__Alternatives ) )
            {
            // InternalLayeredStyleDSL.g:192:2: ( ( rule__SubRelation__Alternatives ) )
            // InternalLayeredStyleDSL.g:193:3: ( rule__SubRelation__Alternatives )
            {
             before(grammarAccess.getSubRelationAccess().getAlternatives()); 
            // InternalLayeredStyleDSL.g:194:3: ( rule__SubRelation__Alternatives )
            // InternalLayeredStyleDSL.g:194:4: rule__SubRelation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SubRelation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSubRelationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubRelation"


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // InternalLayeredStyleDSL.g:202:1: rule__AbstractElement__Alternatives : ( ( ruleLayer ) | ( ruleRelation ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:206:1: ( ( ruleLayer ) | ( ruleRelation ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalLayeredStyleDSL.g:207:2: ( ruleLayer )
                    {
                    // InternalLayeredStyleDSL.g:207:2: ( ruleLayer )
                    // InternalLayeredStyleDSL.g:208:3: ruleLayer
                    {
                     before(grammarAccess.getAbstractElementAccess().getLayerParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLayer();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getLayerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLayeredStyleDSL.g:213:2: ( ruleRelation )
                    {
                    // InternalLayeredStyleDSL.g:213:2: ( ruleRelation )
                    // InternalLayeredStyleDSL.g:214:3: ruleRelation
                    {
                     before(grammarAccess.getAbstractElementAccess().getRelationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRelation();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getRelationParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractElement__Alternatives"


    // $ANTLR start "rule__SubRelation__Alternatives"
    // InternalLayeredStyleDSL.g:223:1: rule__SubRelation__Alternatives : ( ( 'AllowedToUse' ) | ( 'AllowedToUseBelow' ) );
    public final void rule__SubRelation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:227:1: ( ( 'AllowedToUse' ) | ( 'AllowedToUseBelow' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalLayeredStyleDSL.g:228:2: ( 'AllowedToUse' )
                    {
                    // InternalLayeredStyleDSL.g:228:2: ( 'AllowedToUse' )
                    // InternalLayeredStyleDSL.g:229:3: 'AllowedToUse'
                    {
                     before(grammarAccess.getSubRelationAccess().getAllowedToUseKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getSubRelationAccess().getAllowedToUseKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLayeredStyleDSL.g:234:2: ( 'AllowedToUseBelow' )
                    {
                    // InternalLayeredStyleDSL.g:234:2: ( 'AllowedToUseBelow' )
                    // InternalLayeredStyleDSL.g:235:3: 'AllowedToUseBelow'
                    {
                     before(grammarAccess.getSubRelationAccess().getAllowedToUseBelowKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getSubRelationAccess().getAllowedToUseBelowKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubRelation__Alternatives"


    // $ANTLR start "rule__Layer__Group__0"
    // InternalLayeredStyleDSL.g:244:1: rule__Layer__Group__0 : rule__Layer__Group__0__Impl rule__Layer__Group__1 ;
    public final void rule__Layer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:248:1: ( rule__Layer__Group__0__Impl rule__Layer__Group__1 )
            // InternalLayeredStyleDSL.g:249:2: rule__Layer__Group__0__Impl rule__Layer__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Layer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__0"


    // $ANTLR start "rule__Layer__Group__0__Impl"
    // InternalLayeredStyleDSL.g:256:1: rule__Layer__Group__0__Impl : ( 'layer' ) ;
    public final void rule__Layer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:260:1: ( ( 'layer' ) )
            // InternalLayeredStyleDSL.g:261:1: ( 'layer' )
            {
            // InternalLayeredStyleDSL.g:261:1: ( 'layer' )
            // InternalLayeredStyleDSL.g:262:2: 'layer'
            {
             before(grammarAccess.getLayerAccess().getLayerKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getLayerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__0__Impl"


    // $ANTLR start "rule__Layer__Group__1"
    // InternalLayeredStyleDSL.g:271:1: rule__Layer__Group__1 : rule__Layer__Group__1__Impl rule__Layer__Group__2 ;
    public final void rule__Layer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:275:1: ( rule__Layer__Group__1__Impl rule__Layer__Group__2 )
            // InternalLayeredStyleDSL.g:276:2: rule__Layer__Group__1__Impl rule__Layer__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Layer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__1"


    // $ANTLR start "rule__Layer__Group__1__Impl"
    // InternalLayeredStyleDSL.g:283:1: rule__Layer__Group__1__Impl : ( ( rule__Layer__NameAssignment_1 ) ) ;
    public final void rule__Layer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:287:1: ( ( ( rule__Layer__NameAssignment_1 ) ) )
            // InternalLayeredStyleDSL.g:288:1: ( ( rule__Layer__NameAssignment_1 ) )
            {
            // InternalLayeredStyleDSL.g:288:1: ( ( rule__Layer__NameAssignment_1 ) )
            // InternalLayeredStyleDSL.g:289:2: ( rule__Layer__NameAssignment_1 )
            {
             before(grammarAccess.getLayerAccess().getNameAssignment_1()); 
            // InternalLayeredStyleDSL.g:290:2: ( rule__Layer__NameAssignment_1 )
            // InternalLayeredStyleDSL.g:290:3: rule__Layer__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Layer__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__1__Impl"


    // $ANTLR start "rule__Layer__Group__2"
    // InternalLayeredStyleDSL.g:298:1: rule__Layer__Group__2 : rule__Layer__Group__2__Impl rule__Layer__Group__3 ;
    public final void rule__Layer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:302:1: ( rule__Layer__Group__2__Impl rule__Layer__Group__3 )
            // InternalLayeredStyleDSL.g:303:2: rule__Layer__Group__2__Impl rule__Layer__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Layer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__2"


    // $ANTLR start "rule__Layer__Group__2__Impl"
    // InternalLayeredStyleDSL.g:310:1: rule__Layer__Group__2__Impl : ( '{' ) ;
    public final void rule__Layer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:314:1: ( ( '{' ) )
            // InternalLayeredStyleDSL.g:315:1: ( '{' )
            {
            // InternalLayeredStyleDSL.g:315:1: ( '{' )
            // InternalLayeredStyleDSL.g:316:2: '{'
            {
             before(grammarAccess.getLayerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__2__Impl"


    // $ANTLR start "rule__Layer__Group__3"
    // InternalLayeredStyleDSL.g:325:1: rule__Layer__Group__3 : rule__Layer__Group__3__Impl rule__Layer__Group__4 ;
    public final void rule__Layer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:329:1: ( rule__Layer__Group__3__Impl rule__Layer__Group__4 )
            // InternalLayeredStyleDSL.g:330:2: rule__Layer__Group__3__Impl rule__Layer__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Layer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__3"


    // $ANTLR start "rule__Layer__Group__3__Impl"
    // InternalLayeredStyleDSL.g:337:1: rule__Layer__Group__3__Impl : ( ( rule__Layer__LayerSegmentsAssignment_3 )* ) ;
    public final void rule__Layer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:341:1: ( ( ( rule__Layer__LayerSegmentsAssignment_3 )* ) )
            // InternalLayeredStyleDSL.g:342:1: ( ( rule__Layer__LayerSegmentsAssignment_3 )* )
            {
            // InternalLayeredStyleDSL.g:342:1: ( ( rule__Layer__LayerSegmentsAssignment_3 )* )
            // InternalLayeredStyleDSL.g:343:2: ( rule__Layer__LayerSegmentsAssignment_3 )*
            {
             before(grammarAccess.getLayerAccess().getLayerSegmentsAssignment_3()); 
            // InternalLayeredStyleDSL.g:344:2: ( rule__Layer__LayerSegmentsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalLayeredStyleDSL.g:344:3: rule__Layer__LayerSegmentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Layer__LayerSegmentsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getLayerAccess().getLayerSegmentsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__3__Impl"


    // $ANTLR start "rule__Layer__Group__4"
    // InternalLayeredStyleDSL.g:352:1: rule__Layer__Group__4 : rule__Layer__Group__4__Impl ;
    public final void rule__Layer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:356:1: ( rule__Layer__Group__4__Impl )
            // InternalLayeredStyleDSL.g:357:2: rule__Layer__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Layer__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__4"


    // $ANTLR start "rule__Layer__Group__4__Impl"
    // InternalLayeredStyleDSL.g:363:1: rule__Layer__Group__4__Impl : ( '}' ) ;
    public final void rule__Layer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:367:1: ( ( '}' ) )
            // InternalLayeredStyleDSL.g:368:1: ( '}' )
            {
            // InternalLayeredStyleDSL.g:368:1: ( '}' )
            // InternalLayeredStyleDSL.g:369:2: '}'
            {
             before(grammarAccess.getLayerAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__4__Impl"


    // $ANTLR start "rule__LayerSegment__Group__0"
    // InternalLayeredStyleDSL.g:379:1: rule__LayerSegment__Group__0 : rule__LayerSegment__Group__0__Impl rule__LayerSegment__Group__1 ;
    public final void rule__LayerSegment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:383:1: ( rule__LayerSegment__Group__0__Impl rule__LayerSegment__Group__1 )
            // InternalLayeredStyleDSL.g:384:2: rule__LayerSegment__Group__0__Impl rule__LayerSegment__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__LayerSegment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LayerSegment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerSegment__Group__0"


    // $ANTLR start "rule__LayerSegment__Group__0__Impl"
    // InternalLayeredStyleDSL.g:391:1: rule__LayerSegment__Group__0__Impl : ( 'segment' ) ;
    public final void rule__LayerSegment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:395:1: ( ( 'segment' ) )
            // InternalLayeredStyleDSL.g:396:1: ( 'segment' )
            {
            // InternalLayeredStyleDSL.g:396:1: ( 'segment' )
            // InternalLayeredStyleDSL.g:397:2: 'segment'
            {
             before(grammarAccess.getLayerSegmentAccess().getSegmentKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getLayerSegmentAccess().getSegmentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerSegment__Group__0__Impl"


    // $ANTLR start "rule__LayerSegment__Group__1"
    // InternalLayeredStyleDSL.g:406:1: rule__LayerSegment__Group__1 : rule__LayerSegment__Group__1__Impl ;
    public final void rule__LayerSegment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:410:1: ( rule__LayerSegment__Group__1__Impl )
            // InternalLayeredStyleDSL.g:411:2: rule__LayerSegment__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LayerSegment__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerSegment__Group__1"


    // $ANTLR start "rule__LayerSegment__Group__1__Impl"
    // InternalLayeredStyleDSL.g:417:1: rule__LayerSegment__Group__1__Impl : ( ( rule__LayerSegment__NameAssignment_1 ) ) ;
    public final void rule__LayerSegment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:421:1: ( ( ( rule__LayerSegment__NameAssignment_1 ) ) )
            // InternalLayeredStyleDSL.g:422:1: ( ( rule__LayerSegment__NameAssignment_1 ) )
            {
            // InternalLayeredStyleDSL.g:422:1: ( ( rule__LayerSegment__NameAssignment_1 ) )
            // InternalLayeredStyleDSL.g:423:2: ( rule__LayerSegment__NameAssignment_1 )
            {
             before(grammarAccess.getLayerSegmentAccess().getNameAssignment_1()); 
            // InternalLayeredStyleDSL.g:424:2: ( rule__LayerSegment__NameAssignment_1 )
            // InternalLayeredStyleDSL.g:424:3: rule__LayerSegment__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LayerSegment__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLayerSegmentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerSegment__Group__1__Impl"


    // $ANTLR start "rule__Relation__Group__0"
    // InternalLayeredStyleDSL.g:433:1: rule__Relation__Group__0 : rule__Relation__Group__0__Impl rule__Relation__Group__1 ;
    public final void rule__Relation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:437:1: ( rule__Relation__Group__0__Impl rule__Relation__Group__1 )
            // InternalLayeredStyleDSL.g:438:2: rule__Relation__Group__0__Impl rule__Relation__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Relation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__0"


    // $ANTLR start "rule__Relation__Group__0__Impl"
    // InternalLayeredStyleDSL.g:445:1: rule__Relation__Group__0__Impl : ( 'relation' ) ;
    public final void rule__Relation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:449:1: ( ( 'relation' ) )
            // InternalLayeredStyleDSL.g:450:1: ( 'relation' )
            {
            // InternalLayeredStyleDSL.g:450:1: ( 'relation' )
            // InternalLayeredStyleDSL.g:451:2: 'relation'
            {
             before(grammarAccess.getRelationAccess().getRelationKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getRelationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__0__Impl"


    // $ANTLR start "rule__Relation__Group__1"
    // InternalLayeredStyleDSL.g:460:1: rule__Relation__Group__1 : rule__Relation__Group__1__Impl rule__Relation__Group__2 ;
    public final void rule__Relation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:464:1: ( rule__Relation__Group__1__Impl rule__Relation__Group__2 )
            // InternalLayeredStyleDSL.g:465:2: rule__Relation__Group__1__Impl rule__Relation__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Relation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__1"


    // $ANTLR start "rule__Relation__Group__1__Impl"
    // InternalLayeredStyleDSL.g:472:1: rule__Relation__Group__1__Impl : ( ( rule__Relation__NameAssignment_1 ) ) ;
    public final void rule__Relation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:476:1: ( ( ( rule__Relation__NameAssignment_1 ) ) )
            // InternalLayeredStyleDSL.g:477:1: ( ( rule__Relation__NameAssignment_1 ) )
            {
            // InternalLayeredStyleDSL.g:477:1: ( ( rule__Relation__NameAssignment_1 ) )
            // InternalLayeredStyleDSL.g:478:2: ( rule__Relation__NameAssignment_1 )
            {
             before(grammarAccess.getRelationAccess().getNameAssignment_1()); 
            // InternalLayeredStyleDSL.g:479:2: ( rule__Relation__NameAssignment_1 )
            // InternalLayeredStyleDSL.g:479:3: rule__Relation__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Relation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__1__Impl"


    // $ANTLR start "rule__Relation__Group__2"
    // InternalLayeredStyleDSL.g:487:1: rule__Relation__Group__2 : rule__Relation__Group__2__Impl rule__Relation__Group__3 ;
    public final void rule__Relation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:491:1: ( rule__Relation__Group__2__Impl rule__Relation__Group__3 )
            // InternalLayeredStyleDSL.g:492:2: rule__Relation__Group__2__Impl rule__Relation__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Relation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__2"


    // $ANTLR start "rule__Relation__Group__2__Impl"
    // InternalLayeredStyleDSL.g:499:1: rule__Relation__Group__2__Impl : ( '{' ) ;
    public final void rule__Relation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:503:1: ( ( '{' ) )
            // InternalLayeredStyleDSL.g:504:1: ( '{' )
            {
            // InternalLayeredStyleDSL.g:504:1: ( '{' )
            // InternalLayeredStyleDSL.g:505:2: '{'
            {
             before(grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__2__Impl"


    // $ANTLR start "rule__Relation__Group__3"
    // InternalLayeredStyleDSL.g:514:1: rule__Relation__Group__3 : rule__Relation__Group__3__Impl rule__Relation__Group__4 ;
    public final void rule__Relation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:518:1: ( rule__Relation__Group__3__Impl rule__Relation__Group__4 )
            // InternalLayeredStyleDSL.g:519:2: rule__Relation__Group__3__Impl rule__Relation__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Relation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__3"


    // $ANTLR start "rule__Relation__Group__3__Impl"
    // InternalLayeredStyleDSL.g:526:1: rule__Relation__Group__3__Impl : ( 'type' ) ;
    public final void rule__Relation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:530:1: ( ( 'type' ) )
            // InternalLayeredStyleDSL.g:531:1: ( 'type' )
            {
            // InternalLayeredStyleDSL.g:531:1: ( 'type' )
            // InternalLayeredStyleDSL.g:532:2: 'type'
            {
             before(grammarAccess.getRelationAccess().getTypeKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__3__Impl"


    // $ANTLR start "rule__Relation__Group__4"
    // InternalLayeredStyleDSL.g:541:1: rule__Relation__Group__4 : rule__Relation__Group__4__Impl rule__Relation__Group__5 ;
    public final void rule__Relation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:545:1: ( rule__Relation__Group__4__Impl rule__Relation__Group__5 )
            // InternalLayeredStyleDSL.g:546:2: rule__Relation__Group__4__Impl rule__Relation__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Relation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__4"


    // $ANTLR start "rule__Relation__Group__4__Impl"
    // InternalLayeredStyleDSL.g:553:1: rule__Relation__Group__4__Impl : ( ':' ) ;
    public final void rule__Relation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:557:1: ( ( ':' ) )
            // InternalLayeredStyleDSL.g:558:1: ( ':' )
            {
            // InternalLayeredStyleDSL.g:558:1: ( ':' )
            // InternalLayeredStyleDSL.g:559:2: ':'
            {
             before(grammarAccess.getRelationAccess().getColonKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__4__Impl"


    // $ANTLR start "rule__Relation__Group__5"
    // InternalLayeredStyleDSL.g:568:1: rule__Relation__Group__5 : rule__Relation__Group__5__Impl rule__Relation__Group__6 ;
    public final void rule__Relation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:572:1: ( rule__Relation__Group__5__Impl rule__Relation__Group__6 )
            // InternalLayeredStyleDSL.g:573:2: rule__Relation__Group__5__Impl rule__Relation__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Relation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__5"


    // $ANTLR start "rule__Relation__Group__5__Impl"
    // InternalLayeredStyleDSL.g:580:1: rule__Relation__Group__5__Impl : ( ruleSubRelation ) ;
    public final void rule__Relation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:584:1: ( ( ruleSubRelation ) )
            // InternalLayeredStyleDSL.g:585:1: ( ruleSubRelation )
            {
            // InternalLayeredStyleDSL.g:585:1: ( ruleSubRelation )
            // InternalLayeredStyleDSL.g:586:2: ruleSubRelation
            {
             before(grammarAccess.getRelationAccess().getSubRelationParserRuleCall_5()); 
            pushFollow(FOLLOW_2);
            ruleSubRelation();

            state._fsp--;

             after(grammarAccess.getRelationAccess().getSubRelationParserRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__5__Impl"


    // $ANTLR start "rule__Relation__Group__6"
    // InternalLayeredStyleDSL.g:595:1: rule__Relation__Group__6 : rule__Relation__Group__6__Impl rule__Relation__Group__7 ;
    public final void rule__Relation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:599:1: ( rule__Relation__Group__6__Impl rule__Relation__Group__7 )
            // InternalLayeredStyleDSL.g:600:2: rule__Relation__Group__6__Impl rule__Relation__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Relation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__6"


    // $ANTLR start "rule__Relation__Group__6__Impl"
    // InternalLayeredStyleDSL.g:607:1: rule__Relation__Group__6__Impl : ( 'source' ) ;
    public final void rule__Relation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:611:1: ( ( 'source' ) )
            // InternalLayeredStyleDSL.g:612:1: ( 'source' )
            {
            // InternalLayeredStyleDSL.g:612:1: ( 'source' )
            // InternalLayeredStyleDSL.g:613:2: 'source'
            {
             before(grammarAccess.getRelationAccess().getSourceKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getSourceKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__6__Impl"


    // $ANTLR start "rule__Relation__Group__7"
    // InternalLayeredStyleDSL.g:622:1: rule__Relation__Group__7 : rule__Relation__Group__7__Impl rule__Relation__Group__8 ;
    public final void rule__Relation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:626:1: ( rule__Relation__Group__7__Impl rule__Relation__Group__8 )
            // InternalLayeredStyleDSL.g:627:2: rule__Relation__Group__7__Impl rule__Relation__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__Relation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__7"


    // $ANTLR start "rule__Relation__Group__7__Impl"
    // InternalLayeredStyleDSL.g:634:1: rule__Relation__Group__7__Impl : ( ':' ) ;
    public final void rule__Relation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:638:1: ( ( ':' ) )
            // InternalLayeredStyleDSL.g:639:1: ( ':' )
            {
            // InternalLayeredStyleDSL.g:639:1: ( ':' )
            // InternalLayeredStyleDSL.g:640:2: ':'
            {
             before(grammarAccess.getRelationAccess().getColonKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getColonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__7__Impl"


    // $ANTLR start "rule__Relation__Group__8"
    // InternalLayeredStyleDSL.g:649:1: rule__Relation__Group__8 : rule__Relation__Group__8__Impl rule__Relation__Group__9 ;
    public final void rule__Relation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:653:1: ( rule__Relation__Group__8__Impl rule__Relation__Group__9 )
            // InternalLayeredStyleDSL.g:654:2: rule__Relation__Group__8__Impl rule__Relation__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__Relation__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__8"


    // $ANTLR start "rule__Relation__Group__8__Impl"
    // InternalLayeredStyleDSL.g:661:1: rule__Relation__Group__8__Impl : ( ( rule__Relation__TypeAssignment_8 ) ) ;
    public final void rule__Relation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:665:1: ( ( ( rule__Relation__TypeAssignment_8 ) ) )
            // InternalLayeredStyleDSL.g:666:1: ( ( rule__Relation__TypeAssignment_8 ) )
            {
            // InternalLayeredStyleDSL.g:666:1: ( ( rule__Relation__TypeAssignment_8 ) )
            // InternalLayeredStyleDSL.g:667:2: ( rule__Relation__TypeAssignment_8 )
            {
             before(grammarAccess.getRelationAccess().getTypeAssignment_8()); 
            // InternalLayeredStyleDSL.g:668:2: ( rule__Relation__TypeAssignment_8 )
            // InternalLayeredStyleDSL.g:668:3: rule__Relation__TypeAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Relation__TypeAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getTypeAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__8__Impl"


    // $ANTLR start "rule__Relation__Group__9"
    // InternalLayeredStyleDSL.g:676:1: rule__Relation__Group__9 : rule__Relation__Group__9__Impl rule__Relation__Group__10 ;
    public final void rule__Relation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:680:1: ( rule__Relation__Group__9__Impl rule__Relation__Group__10 )
            // InternalLayeredStyleDSL.g:681:2: rule__Relation__Group__9__Impl rule__Relation__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__Relation__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__9"


    // $ANTLR start "rule__Relation__Group__9__Impl"
    // InternalLayeredStyleDSL.g:688:1: rule__Relation__Group__9__Impl : ( 'target' ) ;
    public final void rule__Relation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:692:1: ( ( 'target' ) )
            // InternalLayeredStyleDSL.g:693:1: ( 'target' )
            {
            // InternalLayeredStyleDSL.g:693:1: ( 'target' )
            // InternalLayeredStyleDSL.g:694:2: 'target'
            {
             before(grammarAccess.getRelationAccess().getTargetKeyword_9()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getTargetKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__9__Impl"


    // $ANTLR start "rule__Relation__Group__10"
    // InternalLayeredStyleDSL.g:703:1: rule__Relation__Group__10 : rule__Relation__Group__10__Impl rule__Relation__Group__11 ;
    public final void rule__Relation__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:707:1: ( rule__Relation__Group__10__Impl rule__Relation__Group__11 )
            // InternalLayeredStyleDSL.g:708:2: rule__Relation__Group__10__Impl rule__Relation__Group__11
            {
            pushFollow(FOLLOW_4);
            rule__Relation__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__10"


    // $ANTLR start "rule__Relation__Group__10__Impl"
    // InternalLayeredStyleDSL.g:715:1: rule__Relation__Group__10__Impl : ( ':' ) ;
    public final void rule__Relation__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:719:1: ( ( ':' ) )
            // InternalLayeredStyleDSL.g:720:1: ( ':' )
            {
            // InternalLayeredStyleDSL.g:720:1: ( ':' )
            // InternalLayeredStyleDSL.g:721:2: ':'
            {
             before(grammarAccess.getRelationAccess().getColonKeyword_10()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getColonKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__10__Impl"


    // $ANTLR start "rule__Relation__Group__11"
    // InternalLayeredStyleDSL.g:730:1: rule__Relation__Group__11 : rule__Relation__Group__11__Impl rule__Relation__Group__12 ;
    public final void rule__Relation__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:734:1: ( rule__Relation__Group__11__Impl rule__Relation__Group__12 )
            // InternalLayeredStyleDSL.g:735:2: rule__Relation__Group__11__Impl rule__Relation__Group__12
            {
            pushFollow(FOLLOW_13);
            rule__Relation__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__11"


    // $ANTLR start "rule__Relation__Group__11__Impl"
    // InternalLayeredStyleDSL.g:742:1: rule__Relation__Group__11__Impl : ( ( rule__Relation__TypeAssignment_11 ) ) ;
    public final void rule__Relation__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:746:1: ( ( ( rule__Relation__TypeAssignment_11 ) ) )
            // InternalLayeredStyleDSL.g:747:1: ( ( rule__Relation__TypeAssignment_11 ) )
            {
            // InternalLayeredStyleDSL.g:747:1: ( ( rule__Relation__TypeAssignment_11 ) )
            // InternalLayeredStyleDSL.g:748:2: ( rule__Relation__TypeAssignment_11 )
            {
             before(grammarAccess.getRelationAccess().getTypeAssignment_11()); 
            // InternalLayeredStyleDSL.g:749:2: ( rule__Relation__TypeAssignment_11 )
            // InternalLayeredStyleDSL.g:749:3: rule__Relation__TypeAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Relation__TypeAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getTypeAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__11__Impl"


    // $ANTLR start "rule__Relation__Group__12"
    // InternalLayeredStyleDSL.g:757:1: rule__Relation__Group__12 : rule__Relation__Group__12__Impl ;
    public final void rule__Relation__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:761:1: ( rule__Relation__Group__12__Impl )
            // InternalLayeredStyleDSL.g:762:2: rule__Relation__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__12"


    // $ANTLR start "rule__Relation__Group__12__Impl"
    // InternalLayeredStyleDSL.g:768:1: rule__Relation__Group__12__Impl : ( '}' ) ;
    public final void rule__Relation__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:772:1: ( ( '}' ) )
            // InternalLayeredStyleDSL.g:773:1: ( '}' )
            {
            // InternalLayeredStyleDSL.g:773:1: ( '}' )
            // InternalLayeredStyleDSL.g:774:2: '}'
            {
             before(grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_12()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__12__Impl"


    // $ANTLR start "rule__LayeredStyle__ElementsAssignment"
    // InternalLayeredStyleDSL.g:784:1: rule__LayeredStyle__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__LayeredStyle__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:788:1: ( ( ruleAbstractElement ) )
            // InternalLayeredStyleDSL.g:789:2: ( ruleAbstractElement )
            {
            // InternalLayeredStyleDSL.g:789:2: ( ruleAbstractElement )
            // InternalLayeredStyleDSL.g:790:3: ruleAbstractElement
            {
             before(grammarAccess.getLayeredStyleAccess().getElementsAbstractElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getLayeredStyleAccess().getElementsAbstractElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayeredStyle__ElementsAssignment"


    // $ANTLR start "rule__Layer__NameAssignment_1"
    // InternalLayeredStyleDSL.g:799:1: rule__Layer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Layer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:803:1: ( ( RULE_ID ) )
            // InternalLayeredStyleDSL.g:804:2: ( RULE_ID )
            {
            // InternalLayeredStyleDSL.g:804:2: ( RULE_ID )
            // InternalLayeredStyleDSL.g:805:3: RULE_ID
            {
             before(grammarAccess.getLayerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__NameAssignment_1"


    // $ANTLR start "rule__Layer__LayerSegmentsAssignment_3"
    // InternalLayeredStyleDSL.g:814:1: rule__Layer__LayerSegmentsAssignment_3 : ( ruleLayerSegment ) ;
    public final void rule__Layer__LayerSegmentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:818:1: ( ( ruleLayerSegment ) )
            // InternalLayeredStyleDSL.g:819:2: ( ruleLayerSegment )
            {
            // InternalLayeredStyleDSL.g:819:2: ( ruleLayerSegment )
            // InternalLayeredStyleDSL.g:820:3: ruleLayerSegment
            {
             before(grammarAccess.getLayerAccess().getLayerSegmentsLayerSegmentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLayerSegment();

            state._fsp--;

             after(grammarAccess.getLayerAccess().getLayerSegmentsLayerSegmentParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__LayerSegmentsAssignment_3"


    // $ANTLR start "rule__LayerSegment__NameAssignment_1"
    // InternalLayeredStyleDSL.g:829:1: rule__LayerSegment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LayerSegment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:833:1: ( ( RULE_ID ) )
            // InternalLayeredStyleDSL.g:834:2: ( RULE_ID )
            {
            // InternalLayeredStyleDSL.g:834:2: ( RULE_ID )
            // InternalLayeredStyleDSL.g:835:3: RULE_ID
            {
             before(grammarAccess.getLayerSegmentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLayerSegmentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerSegment__NameAssignment_1"


    // $ANTLR start "rule__Relation__NameAssignment_1"
    // InternalLayeredStyleDSL.g:844:1: rule__Relation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Relation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:848:1: ( ( RULE_ID ) )
            // InternalLayeredStyleDSL.g:849:2: ( RULE_ID )
            {
            // InternalLayeredStyleDSL.g:849:2: ( RULE_ID )
            // InternalLayeredStyleDSL.g:850:3: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__NameAssignment_1"


    // $ANTLR start "rule__Relation__TypeAssignment_8"
    // InternalLayeredStyleDSL.g:859:1: rule__Relation__TypeAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Relation__TypeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:863:1: ( ( ( RULE_ID ) ) )
            // InternalLayeredStyleDSL.g:864:2: ( ( RULE_ID ) )
            {
            // InternalLayeredStyleDSL.g:864:2: ( ( RULE_ID ) )
            // InternalLayeredStyleDSL.g:865:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationAccess().getTypeLayerCrossReference_8_0()); 
            // InternalLayeredStyleDSL.g:866:3: ( RULE_ID )
            // InternalLayeredStyleDSL.g:867:4: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getTypeLayerIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getTypeLayerIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getRelationAccess().getTypeLayerCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__TypeAssignment_8"


    // $ANTLR start "rule__Relation__TypeAssignment_11"
    // InternalLayeredStyleDSL.g:878:1: rule__Relation__TypeAssignment_11 : ( ( RULE_ID ) ) ;
    public final void rule__Relation__TypeAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLayeredStyleDSL.g:882:1: ( ( ( RULE_ID ) ) )
            // InternalLayeredStyleDSL.g:883:2: ( ( RULE_ID ) )
            {
            // InternalLayeredStyleDSL.g:883:2: ( ( RULE_ID ) )
            // InternalLayeredStyleDSL.g:884:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationAccess().getTypeLayerCrossReference_11_0()); 
            // InternalLayeredStyleDSL.g:885:3: ( RULE_ID )
            // InternalLayeredStyleDSL.g:886:4: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getTypeLayerIDTerminalRuleCall_11_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getTypeLayerIDTerminalRuleCall_11_0_1()); 

            }

             after(grammarAccess.getRelationAccess().getTypeLayerCrossReference_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__TypeAssignment_11"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000022002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008000L});

}