package org.xtext.lab2.layeredStyle.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.lab2.layeredStyle.services.LayeredStyleDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLayeredStyleDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'layer'", "'{'", "'}'", "'segment'", "'relation'", "'type'", "':'", "'source'", "'target'", "'AllowedToUse'", "'AllowedToUseBelow'"
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

        public InternalLayeredStyleDSLParser(TokenStream input, LayeredStyleDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "LayeredStyle";
       	}

       	@Override
       	protected LayeredStyleDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleLayeredStyle"
    // InternalLayeredStyleDSL.g:64:1: entryRuleLayeredStyle returns [EObject current=null] : iv_ruleLayeredStyle= ruleLayeredStyle EOF ;
    public final EObject entryRuleLayeredStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayeredStyle = null;


        try {
            // InternalLayeredStyleDSL.g:64:53: (iv_ruleLayeredStyle= ruleLayeredStyle EOF )
            // InternalLayeredStyleDSL.g:65:2: iv_ruleLayeredStyle= ruleLayeredStyle EOF
            {
             newCompositeNode(grammarAccess.getLayeredStyleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayeredStyle=ruleLayeredStyle();

            state._fsp--;

             current =iv_ruleLayeredStyle; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLayeredStyle"


    // $ANTLR start "ruleLayeredStyle"
    // InternalLayeredStyleDSL.g:71:1: ruleLayeredStyle returns [EObject current=null] : ( (lv_elements_0_0= ruleAbstractElement ) )* ;
    public final EObject ruleLayeredStyle() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalLayeredStyleDSL.g:77:2: ( ( (lv_elements_0_0= ruleAbstractElement ) )* )
            // InternalLayeredStyleDSL.g:78:2: ( (lv_elements_0_0= ruleAbstractElement ) )*
            {
            // InternalLayeredStyleDSL.g:78:2: ( (lv_elements_0_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLayeredStyleDSL.g:79:3: (lv_elements_0_0= ruleAbstractElement )
            	    {
            	    // InternalLayeredStyleDSL.g:79:3: (lv_elements_0_0= ruleAbstractElement )
            	    // InternalLayeredStyleDSL.g:80:4: lv_elements_0_0= ruleAbstractElement
            	    {

            	    				newCompositeNode(grammarAccess.getLayeredStyleAccess().getElementsAbstractElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleAbstractElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getLayeredStyleRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.xtext.lab2.layeredStyle.LayeredStyleDSL.AbstractElement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayeredStyle"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalLayeredStyleDSL.g:100:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // InternalLayeredStyleDSL.g:100:56: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // InternalLayeredStyleDSL.g:101:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalLayeredStyleDSL.g:107:1: ruleAbstractElement returns [EObject current=null] : (this_Layer_0= ruleLayer | this_Relation_1= ruleRelation ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Layer_0 = null;

        EObject this_Relation_1 = null;



        	enterRule();

        try {
            // InternalLayeredStyleDSL.g:113:2: ( (this_Layer_0= ruleLayer | this_Relation_1= ruleRelation ) )
            // InternalLayeredStyleDSL.g:114:2: (this_Layer_0= ruleLayer | this_Relation_1= ruleRelation )
            {
            // InternalLayeredStyleDSL.g:114:2: (this_Layer_0= ruleLayer | this_Relation_1= ruleRelation )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalLayeredStyleDSL.g:115:3: this_Layer_0= ruleLayer
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getLayerParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Layer_0=ruleLayer();

                    state._fsp--;


                    			current = this_Layer_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLayeredStyleDSL.g:124:3: this_Relation_1= ruleRelation
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getRelationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Relation_1=ruleRelation();

                    state._fsp--;


                    			current = this_Relation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleLayer"
    // InternalLayeredStyleDSL.g:136:1: entryRuleLayer returns [EObject current=null] : iv_ruleLayer= ruleLayer EOF ;
    public final EObject entryRuleLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayer = null;


        try {
            // InternalLayeredStyleDSL.g:136:46: (iv_ruleLayer= ruleLayer EOF )
            // InternalLayeredStyleDSL.g:137:2: iv_ruleLayer= ruleLayer EOF
            {
             newCompositeNode(grammarAccess.getLayerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayer=ruleLayer();

            state._fsp--;

             current =iv_ruleLayer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLayer"


    // $ANTLR start "ruleLayer"
    // InternalLayeredStyleDSL.g:143:1: ruleLayer returns [EObject current=null] : (otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_layerSegments_3_0= ruleLayerSegment ) )* otherlv_4= '}' ) ;
    public final EObject ruleLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_layerSegments_3_0 = null;



        	enterRule();

        try {
            // InternalLayeredStyleDSL.g:149:2: ( (otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_layerSegments_3_0= ruleLayerSegment ) )* otherlv_4= '}' ) )
            // InternalLayeredStyleDSL.g:150:2: (otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_layerSegments_3_0= ruleLayerSegment ) )* otherlv_4= '}' )
            {
            // InternalLayeredStyleDSL.g:150:2: (otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_layerSegments_3_0= ruleLayerSegment ) )* otherlv_4= '}' )
            // InternalLayeredStyleDSL.g:151:3: otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_layerSegments_3_0= ruleLayerSegment ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLayerAccess().getLayerKeyword_0());
            		
            // InternalLayeredStyleDSL.g:155:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLayeredStyleDSL.g:156:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLayeredStyleDSL.g:156:4: (lv_name_1_0= RULE_ID )
            // InternalLayeredStyleDSL.g:157:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLayerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLayerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getLayerAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLayeredStyleDSL.g:177:3: ( (lv_layerSegments_3_0= ruleLayerSegment ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalLayeredStyleDSL.g:178:4: (lv_layerSegments_3_0= ruleLayerSegment )
            	    {
            	    // InternalLayeredStyleDSL.g:178:4: (lv_layerSegments_3_0= ruleLayerSegment )
            	    // InternalLayeredStyleDSL.g:179:5: lv_layerSegments_3_0= ruleLayerSegment
            	    {

            	    					newCompositeNode(grammarAccess.getLayerAccess().getLayerSegmentsLayerSegmentParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_layerSegments_3_0=ruleLayerSegment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLayerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"layerSegments",
            	    						lv_layerSegments_3_0,
            	    						"org.xtext.lab2.layeredStyle.LayeredStyleDSL.LayerSegment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLayerAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayer"


    // $ANTLR start "entryRuleLayerSegment"
    // InternalLayeredStyleDSL.g:204:1: entryRuleLayerSegment returns [EObject current=null] : iv_ruleLayerSegment= ruleLayerSegment EOF ;
    public final EObject entryRuleLayerSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayerSegment = null;


        try {
            // InternalLayeredStyleDSL.g:204:53: (iv_ruleLayerSegment= ruleLayerSegment EOF )
            // InternalLayeredStyleDSL.g:205:2: iv_ruleLayerSegment= ruleLayerSegment EOF
            {
             newCompositeNode(grammarAccess.getLayerSegmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayerSegment=ruleLayerSegment();

            state._fsp--;

             current =iv_ruleLayerSegment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLayerSegment"


    // $ANTLR start "ruleLayerSegment"
    // InternalLayeredStyleDSL.g:211:1: ruleLayerSegment returns [EObject current=null] : (otherlv_0= 'segment' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleLayerSegment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalLayeredStyleDSL.g:217:2: ( (otherlv_0= 'segment' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalLayeredStyleDSL.g:218:2: (otherlv_0= 'segment' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalLayeredStyleDSL.g:218:2: (otherlv_0= 'segment' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalLayeredStyleDSL.g:219:3: otherlv_0= 'segment' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLayerSegmentAccess().getSegmentKeyword_0());
            		
            // InternalLayeredStyleDSL.g:223:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLayeredStyleDSL.g:224:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLayeredStyleDSL.g:224:4: (lv_name_1_0= RULE_ID )
            // InternalLayeredStyleDSL.g:225:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLayerSegmentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLayerSegmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayerSegment"


    // $ANTLR start "entryRuleRelation"
    // InternalLayeredStyleDSL.g:245:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalLayeredStyleDSL.g:245:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalLayeredStyleDSL.g:246:2: iv_ruleRelation= ruleRelation EOF
            {
             newCompositeNode(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelation=ruleRelation();

            state._fsp--;

             current =iv_ruleRelation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalLayeredStyleDSL.g:252:1: ruleRelation returns [EObject current=null] : (otherlv_0= 'relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' otherlv_4= ':' ruleSubRelation otherlv_6= 'source' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'target' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalLayeredStyleDSL.g:258:2: ( (otherlv_0= 'relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' otherlv_4= ':' ruleSubRelation otherlv_6= 'source' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'target' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' ) )
            // InternalLayeredStyleDSL.g:259:2: (otherlv_0= 'relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' otherlv_4= ':' ruleSubRelation otherlv_6= 'source' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'target' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' )
            {
            // InternalLayeredStyleDSL.g:259:2: (otherlv_0= 'relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' otherlv_4= ':' ruleSubRelation otherlv_6= 'source' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'target' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' )
            // InternalLayeredStyleDSL.g:260:3: otherlv_0= 'relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' otherlv_4= ':' ruleSubRelation otherlv_6= 'source' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'target' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRelationAccess().getRelationKeyword_0());
            		
            // InternalLayeredStyleDSL.g:264:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLayeredStyleDSL.g:265:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLayeredStyleDSL.g:265:4: (lv_name_1_0= RULE_ID )
            // InternalLayeredStyleDSL.g:266:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getRelationAccess().getTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getRelationAccess().getColonKeyword_4());
            		

            			newCompositeNode(grammarAccess.getRelationAccess().getSubRelationParserRuleCall_5());
            		
            pushFollow(FOLLOW_10);
            ruleSubRelation();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_6=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getRelationAccess().getSourceKeyword_6());
            		
            otherlv_7=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getRelationAccess().getColonKeyword_7());
            		
            // InternalLayeredStyleDSL.g:309:3: ( (otherlv_8= RULE_ID ) )
            // InternalLayeredStyleDSL.g:310:4: (otherlv_8= RULE_ID )
            {
            // InternalLayeredStyleDSL.g:310:4: (otherlv_8= RULE_ID )
            // InternalLayeredStyleDSL.g:311:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_8, grammarAccess.getRelationAccess().getTypeLayerCrossReference_8_0());
            				

            }


            }

            otherlv_9=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getRelationAccess().getTargetKeyword_9());
            		
            otherlv_10=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getRelationAccess().getColonKeyword_10());
            		
            // InternalLayeredStyleDSL.g:330:3: ( (otherlv_11= RULE_ID ) )
            // InternalLayeredStyleDSL.g:331:4: (otherlv_11= RULE_ID )
            {
            // InternalLayeredStyleDSL.g:331:4: (otherlv_11= RULE_ID )
            // InternalLayeredStyleDSL.g:332:5: otherlv_11= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            				
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_11, grammarAccess.getRelationAccess().getTypeLayerCrossReference_11_0());
            				

            }


            }

            otherlv_12=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleSubRelation"
    // InternalLayeredStyleDSL.g:351:1: entryRuleSubRelation returns [String current=null] : iv_ruleSubRelation= ruleSubRelation EOF ;
    public final String entryRuleSubRelation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSubRelation = null;


        try {
            // InternalLayeredStyleDSL.g:351:51: (iv_ruleSubRelation= ruleSubRelation EOF )
            // InternalLayeredStyleDSL.g:352:2: iv_ruleSubRelation= ruleSubRelation EOF
            {
             newCompositeNode(grammarAccess.getSubRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubRelation=ruleSubRelation();

            state._fsp--;

             current =iv_ruleSubRelation.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubRelation"


    // $ANTLR start "ruleSubRelation"
    // InternalLayeredStyleDSL.g:358:1: ruleSubRelation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'AllowedToUse' | kw= 'AllowedToUseBelow' ) ;
    public final AntlrDatatypeRuleToken ruleSubRelation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLayeredStyleDSL.g:364:2: ( (kw= 'AllowedToUse' | kw= 'AllowedToUseBelow' ) )
            // InternalLayeredStyleDSL.g:365:2: (kw= 'AllowedToUse' | kw= 'AllowedToUseBelow' )
            {
            // InternalLayeredStyleDSL.g:365:2: (kw= 'AllowedToUse' | kw= 'AllowedToUseBelow' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            else if ( (LA4_0==21) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalLayeredStyleDSL.g:366:3: kw= 'AllowedToUse'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSubRelationAccess().getAllowedToUseKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalLayeredStyleDSL.g:372:3: kw= 'AllowedToUseBelow'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSubRelationAccess().getAllowedToUseBelowKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubRelation"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002000L});

}