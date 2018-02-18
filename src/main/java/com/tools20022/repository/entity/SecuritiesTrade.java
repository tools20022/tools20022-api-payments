/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.entity;

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.ext.OtherSemanticMarkup;
import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.Trade;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies trades linked to securities operations such as the exchange of
 * securities, the lending of securities and the transactions related to
 * investment funds.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesTrade" src="doc-files/SecuritiesTrade.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Trade Trade}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesTradeRelatedIdentifications
 * SecuritiesTrade.mmSecuritiesTradeRelatedIdentifications}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeAmount
 * SecuritiesTrade.mmTradeAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmOpeningClosingIndicator
 * SecuritiesTrade.mmOpeningClosingIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeTransactionCondition
 * SecuritiesTrade.mmTradeTransactionCondition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesTradeStatus
 * SecuritiesTrade.mmSecuritiesTradeStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmActivity
 * SecuritiesTrade.mmActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeQuantity
 * SecuritiesTrade.mmTradeQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeOriginationDate
 * SecuritiesTrade.mmTradeOriginationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmClearingFeeType
 * SecuritiesTrade.mmClearingFeeType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecurity
 * SecuritiesTrade.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradePrice
 * SecuritiesTrade.mmTradePrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmPartyRole
 * SecuritiesTrade.mmPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesFinancingClosingData
 * SecuritiesTrade.mmSecuritiesFinancingClosingData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradingExecution
 * SecuritiesTrade.mmTradingExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeAllocation
 * SecuritiesTrade.mmTradeAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmRelatedOrder
 * SecuritiesTrade.mmRelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesFinancingOpeningData
 * SecuritiesTrade.mmSecuritiesFinancingOpeningData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTransactionType
 * SecuritiesTrade.mmTransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmLegalFramework
 * SecuritiesTrade.mmLegalFramework}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesTransactionType
 * SecuritiesTrade.mmSecuritiesTransactionType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmSecuritiesTrade
 * Security.mmSecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmSecuritiesTrade
 * SecuritiesPricing.mmSecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmIdentifiedTrade
 * SecuritiesTradeIdentification.mmIdentifiedTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmTrade
 * SecuritiesQuantity.mmTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmRelatedTrade
 * SecuritiesTradeExecution.mmRelatedTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmSecuritiesTrade
 * SecuritiesTradeStatus.mmSecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmClosingLegExecution
 * SecuritiesFinancing.mmClosingLegExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmOpeningLegExecution
 * SecuritiesFinancing.mmOpeningLegExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderExecution
 * SecuritiesOrder.mmOrderExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradePartyRole#mmSecuritiesTrade
 * SecuritiesTradePartyRole.mmSecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Allocation#mmSecuritiesTrade
 * Allocation.mmSecuritiesTrade}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
 * InvestmentFundTransaction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesFinancing
 * SecuritiesFinancing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOptionTrade
 * SecuritiesOptionTrade}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = type=BusinessComment, BusinessComment=Street Side
 * confirmation</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesTrade"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies trades linked to securities operations such as the exchange of securities, the lending of securities and the transactions related to investment funds."
 * </li>
 * </ul>
 */
public class SecuritiesTrade extends Trade {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.SecuritiesTradeIdentification> securitiesTradeRelatedIdentifications;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmIdentifiedTrade
	 * SecuritiesTradeIdentification.mmIdentifiedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTradeRelatedIdentifications"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the different identifications associated with a securities trade."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesTradeRelatedIdentifications = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTradeRelatedIdentifications";
			definition = "Specifies the different identifications associated with a securities trade.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeIdentification.mmIdentifiedTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeIdentification.mmObject();
		}
	};
	protected CurrencyAndAmount tradeAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::DEAL, FIXSynonym: 381</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of the trade. Is equal to the executed trade quantity multiplied by the executed trade price."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTradeAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::DEAL"), new FIXSynonym(this, "381"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeAmount";
			definition = "Total amount of the trade. Is equal to the executed trade quantity multiplied by the executed trade price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTrade.class.getMethod("getTradeAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected OpeningClosingCode openingClosingIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OpeningClosingCode
	 * OpeningClosingCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22a::PROC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningClosingIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies additional information relative to the processing of the trade."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOpeningClosingIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22a::PROC"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OpeningClosingIndicator";
			definition = "Specifies additional information relative to the processing of the trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OpeningClosingCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTrade.class.getMethod("getOpeningClosingIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TradeTransactionConditionCode tradeTransactionCondition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
	 * TradeTransactionConditionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22a::TTCO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeTransactionCondition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the conditions under which the order/trade is to be/was executed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTradeTransactionCondition = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22a::TTCO"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeTransactionCondition";
			definition = "Indicates the conditions under which the order/trade is to be/was executed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradeTransactionConditionCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTrade.class.getMethod("getTradeTransactionCondition", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesTradeStatus> securitiesTradeStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmSecuritiesTrade
	 * SecuritiesTradeStatus.mmSecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTradeStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status of a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesTradeStatus = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTradeStatus";
			definition = "Specifies the status of a trade.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmSecuritiesTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
		}
	};
	protected TransactionActivityCode activity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionActivityCode
	 * TransactionActivityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Activity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of activity to which the trade relates."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmActivity = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Activity";
			definition = "Specifies the type of activity to which the trade relates.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TransactionActivityCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTrade.class.getMethod("getActivity", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesQuantity> tradeQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmTrade
	 * SecuritiesQuantity.mmTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the total quantity of a financial instrument involved in a trade. It is derived from the ordered quantity or from the quantity specified in a leg of a financing agreement."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTradeQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeQuantity";
			definition = "Specifies the total quantity of a financial instrument involved in a trade. It is derived from the ordered quantity or from the quantity specified in a leg of a financing agreement.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected ISODateTime tradeOriginationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 229</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeOriginationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the date and time of the agreement in principal between counter-parties prior to actual trade date.\nUsed with fixed income for municipal new issue markets."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTradeOriginationDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "229"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeOriginationDate";
			definition = "Indicates the date and time of the agreement in principal between counter-parties prior to actual trade date.\nUsed with fixed income for municipal new issue markets.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTrade.class.getMethod("getTradeOriginationDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ClearingFeeTypeCode clearingFeeType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingFeeTypeCode
	 * ClearingFeeTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 635</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingFeeType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the type of fee for trade executions at an exchange."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmClearingFeeType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "635"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClearingFeeType";
			definition = "Indicates the type of fee for trade executions at an exchange.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ClearingFeeTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTrade.class.getMethod("getClearingFeeType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Security> security;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesTrade
	 * Security.mmSecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security involved in a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecurity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security involved in a trade.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmSecuritiesTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesPricing> tradePrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmSecuritiesTrade
	 * SecuritiesPricing.mmSecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the executed trade price which is derived from the different deal prices."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTradePrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradePrice";
			definition = "Specifies the executed trade price which is derived from the different deal prices.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmSecuritiesTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesTradePartyRole> partyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradePartyRole#mmSecuritiesTrade
	 * SecuritiesTradePartyRole.mmSecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradePartyRole
	 * SecuritiesTradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role linked to a securities trade and played by a party at that step in a securities transaction flow."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to a securities trade and played by a party at that step in a securities transaction flow.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradePartyRole.mmSecuritiesTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTradePartyRole.mmObject();
		}
	};
	protected SecuritiesFinancing securitiesFinancingClosingData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmClosingLegExecution
	 * SecuritiesFinancing.mmClosingLegExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesFinancingClosingData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Financing process for which a closing leg is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesFinancingClosingData = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesFinancingClosingData";
			definition = "Financing process for which a closing leg is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmClosingLegExecution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesTradeExecution> tradingExecution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmRelatedTrade
	 * SecuritiesTradeExecution.mmRelatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The realisation of the trade over one or more transactions."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTradingExecution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradingExecution";
			definition = "The realisation of the trade over one or more transactions.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmRelatedTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Allocation> tradeAllocation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Allocation#mmSecuritiesTrade
	 * Allocation.mmSecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Allocation
	 * Allocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeAllocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about the allocation of the trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTradeAllocation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeAllocation";
			definition = "Information about the allocation of the trade.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Allocation.mmSecuritiesTrade;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Allocation.mmObject();
		}
	};
	protected SecuritiesOrder relatedOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderExecution
	 * SecuritiesOrder.mmOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order which is executed by a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedOrder";
			definition = "Order which is executed by a trade.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmOrderExecution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
		}
	};
	protected SecuritiesFinancing securitiesFinancingOpeningData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmOpeningLegExecution
	 * SecuritiesFinancing.mmOpeningLegExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesFinancingOpeningData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Financing process for which an opening leg is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesFinancingOpeningData = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesFinancingOpeningData";
			definition = "Financing process for which an opening leg is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmOpeningLegExecution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmObject();
		}
	};
	protected TradeTypeCode transactionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode
	 * TradeTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::TRTR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the type of transaction of which the order is a component."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTransactionType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::TRTR"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionType";
			definition = "Indicates the type of transaction of which the order is a component.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradeTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTrade.class.getMethod("getTransactionType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected LegalFrameworkCode legalFramework;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.LegalFrameworkCode
	 * LegalFrameworkCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalFramework"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Legal framework of the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmLegalFramework = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LegalFramework";
			definition = "Legal framework of the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LegalFrameworkCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTrade.class.getMethod("getLegalFramework", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesTransactionTypeV2Code securitiesTransactionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
	 * SecuritiesTransactionTypeV2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::SETR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTransactionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying information about the settlement transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSecuritiesTransactionType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::SETR"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTransactionType";
			definition = "Underlying information about the settlement transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTrade.class.getMethod("getSecuritiesTransactionType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				semanticMarkup_lazy = () -> Arrays.asList(new OtherSemanticMarkup(this, "BusinessComment", new String[]{"BusinessComment", "Street Side confirmation"}));
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTrade";
				definition = "Specifies trades linked to securities operations such as the exchange of securities, the lending of securities and the transactions related to investment funds.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmSecuritiesTrade, com.tools20022.repository.entity.SecuritiesPricing.mmSecuritiesTrade,
						com.tools20022.repository.entity.SecuritiesTradeIdentification.mmIdentifiedTrade, com.tools20022.repository.entity.SecuritiesQuantity.mmTrade,
						com.tools20022.repository.entity.SecuritiesTradeExecution.mmRelatedTrade, com.tools20022.repository.entity.SecuritiesTradeStatus.mmSecuritiesTrade,
						com.tools20022.repository.entity.SecuritiesFinancing.mmClosingLegExecution, com.tools20022.repository.entity.SecuritiesFinancing.mmOpeningLegExecution,
						com.tools20022.repository.entity.SecuritiesOrder.mmOrderExecution, com.tools20022.repository.entity.SecuritiesTradePartyRole.mmSecuritiesTrade, com.tools20022.repository.entity.Allocation.mmSecuritiesTrade);
				subType_lazy = () -> Arrays.asList(InvestmentFundTransaction.mmObject(), com.tools20022.repository.entity.SecuritiesFinancing.mmObject(), SecuritiesOptionTrade.mmObject());
				superType_lazy = () -> Trade.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTrade.mmSecuritiesTradeRelatedIdentifications, com.tools20022.repository.entity.SecuritiesTrade.mmTradeAmount,
						com.tools20022.repository.entity.SecuritiesTrade.mmOpeningClosingIndicator, com.tools20022.repository.entity.SecuritiesTrade.mmTradeTransactionCondition,
						com.tools20022.repository.entity.SecuritiesTrade.mmSecuritiesTradeStatus, com.tools20022.repository.entity.SecuritiesTrade.mmActivity, com.tools20022.repository.entity.SecuritiesTrade.mmTradeQuantity,
						com.tools20022.repository.entity.SecuritiesTrade.mmTradeOriginationDate, com.tools20022.repository.entity.SecuritiesTrade.mmClearingFeeType, com.tools20022.repository.entity.SecuritiesTrade.mmSecurity,
						com.tools20022.repository.entity.SecuritiesTrade.mmTradePrice, com.tools20022.repository.entity.SecuritiesTrade.mmPartyRole, com.tools20022.repository.entity.SecuritiesTrade.mmSecuritiesFinancingClosingData,
						com.tools20022.repository.entity.SecuritiesTrade.mmTradingExecution, com.tools20022.repository.entity.SecuritiesTrade.mmTradeAllocation, com.tools20022.repository.entity.SecuritiesTrade.mmRelatedOrder,
						com.tools20022.repository.entity.SecuritiesTrade.mmSecuritiesFinancingOpeningData, com.tools20022.repository.entity.SecuritiesTrade.mmTransactionType,
						com.tools20022.repository.entity.SecuritiesTrade.mmLegalFramework, com.tools20022.repository.entity.SecuritiesTrade.mmSecuritiesTransactionType);
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesTrade.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<SecuritiesTradeIdentification> getSecuritiesTradeRelatedIdentifications() {
		return securitiesTradeRelatedIdentifications == null ? securitiesTradeRelatedIdentifications = new ArrayList<>() : securitiesTradeRelatedIdentifications;
	}

	public SecuritiesTrade setSecuritiesTradeRelatedIdentifications(List<com.tools20022.repository.entity.SecuritiesTradeIdentification> securitiesTradeRelatedIdentifications) {
		this.securitiesTradeRelatedIdentifications = Objects.requireNonNull(securitiesTradeRelatedIdentifications);
		return this;
	}

	public CurrencyAndAmount getTradeAmount() {
		return tradeAmount;
	}

	public SecuritiesTrade setTradeAmount(CurrencyAndAmount tradeAmount) {
		this.tradeAmount = Objects.requireNonNull(tradeAmount);
		return this;
	}

	public OpeningClosingCode getOpeningClosingIndicator() {
		return openingClosingIndicator;
	}

	public SecuritiesTrade setOpeningClosingIndicator(OpeningClosingCode openingClosingIndicator) {
		this.openingClosingIndicator = Objects.requireNonNull(openingClosingIndicator);
		return this;
	}

	public TradeTransactionConditionCode getTradeTransactionCondition() {
		return tradeTransactionCondition;
	}

	public SecuritiesTrade setTradeTransactionCondition(TradeTransactionConditionCode tradeTransactionCondition) {
		this.tradeTransactionCondition = Objects.requireNonNull(tradeTransactionCondition);
		return this;
	}

	public List<SecuritiesTradeStatus> getSecuritiesTradeStatus() {
		return securitiesTradeStatus == null ? securitiesTradeStatus = new ArrayList<>() : securitiesTradeStatus;
	}

	public SecuritiesTrade setSecuritiesTradeStatus(List<com.tools20022.repository.entity.SecuritiesTradeStatus> securitiesTradeStatus) {
		this.securitiesTradeStatus = Objects.requireNonNull(securitiesTradeStatus);
		return this;
	}

	public TransactionActivityCode getActivity() {
		return activity;
	}

	public SecuritiesTrade setActivity(TransactionActivityCode activity) {
		this.activity = Objects.requireNonNull(activity);
		return this;
	}

	public List<SecuritiesQuantity> getTradeQuantity() {
		return tradeQuantity == null ? tradeQuantity = new ArrayList<>() : tradeQuantity;
	}

	public SecuritiesTrade setTradeQuantity(List<com.tools20022.repository.entity.SecuritiesQuantity> tradeQuantity) {
		this.tradeQuantity = Objects.requireNonNull(tradeQuantity);
		return this;
	}

	public ISODateTime getTradeOriginationDate() {
		return tradeOriginationDate;
	}

	public SecuritiesTrade setTradeOriginationDate(ISODateTime tradeOriginationDate) {
		this.tradeOriginationDate = Objects.requireNonNull(tradeOriginationDate);
		return this;
	}

	public ClearingFeeTypeCode getClearingFeeType() {
		return clearingFeeType;
	}

	public SecuritiesTrade setClearingFeeType(ClearingFeeTypeCode clearingFeeType) {
		this.clearingFeeType = Objects.requireNonNull(clearingFeeType);
		return this;
	}

	public List<Security> getSecurity() {
		return security == null ? security = new ArrayList<>() : security;
	}

	public SecuritiesTrade setSecurity(List<com.tools20022.repository.entity.Security> security) {
		this.security = Objects.requireNonNull(security);
		return this;
	}

	public List<SecuritiesPricing> getTradePrice() {
		return tradePrice == null ? tradePrice = new ArrayList<>() : tradePrice;
	}

	public SecuritiesTrade setTradePrice(List<com.tools20022.repository.entity.SecuritiesPricing> tradePrice) {
		this.tradePrice = Objects.requireNonNull(tradePrice);
		return this;
	}

	public List<SecuritiesTradePartyRole> getPartyRole() {
		return partyRole == null ? partyRole = new ArrayList<>() : partyRole;
	}

	public SecuritiesTrade setPartyRole(List<com.tools20022.repository.entity.SecuritiesTradePartyRole> partyRole) {
		this.partyRole = Objects.requireNonNull(partyRole);
		return this;
	}

	public Optional<SecuritiesFinancing> getSecuritiesFinancingClosingData() {
		return securitiesFinancingClosingData == null ? Optional.empty() : Optional.of(securitiesFinancingClosingData);
	}

	public SecuritiesTrade setSecuritiesFinancingClosingData(com.tools20022.repository.entity.SecuritiesFinancing securitiesFinancingClosingData) {
		this.securitiesFinancingClosingData = securitiesFinancingClosingData;
		return this;
	}

	public List<SecuritiesTradeExecution> getTradingExecution() {
		return tradingExecution == null ? tradingExecution = new ArrayList<>() : tradingExecution;
	}

	public SecuritiesTrade setTradingExecution(List<com.tools20022.repository.entity.SecuritiesTradeExecution> tradingExecution) {
		this.tradingExecution = Objects.requireNonNull(tradingExecution);
		return this;
	}

	public List<Allocation> getTradeAllocation() {
		return tradeAllocation == null ? tradeAllocation = new ArrayList<>() : tradeAllocation;
	}

	public SecuritiesTrade setTradeAllocation(List<com.tools20022.repository.entity.Allocation> tradeAllocation) {
		this.tradeAllocation = Objects.requireNonNull(tradeAllocation);
		return this;
	}

	public Optional<SecuritiesOrder> getRelatedOrder() {
		return relatedOrder == null ? Optional.empty() : Optional.of(relatedOrder);
	}

	public SecuritiesTrade setRelatedOrder(com.tools20022.repository.entity.SecuritiesOrder relatedOrder) {
		this.relatedOrder = relatedOrder;
		return this;
	}

	public Optional<SecuritiesFinancing> getSecuritiesFinancingOpeningData() {
		return securitiesFinancingOpeningData == null ? Optional.empty() : Optional.of(securitiesFinancingOpeningData);
	}

	public SecuritiesTrade setSecuritiesFinancingOpeningData(com.tools20022.repository.entity.SecuritiesFinancing securitiesFinancingOpeningData) {
		this.securitiesFinancingOpeningData = securitiesFinancingOpeningData;
		return this;
	}

	public TradeTypeCode getTransactionType() {
		return transactionType;
	}

	public SecuritiesTrade setTransactionType(TradeTypeCode transactionType) {
		this.transactionType = Objects.requireNonNull(transactionType);
		return this;
	}

	public LegalFrameworkCode getLegalFramework() {
		return legalFramework;
	}

	public SecuritiesTrade setLegalFramework(LegalFrameworkCode legalFramework) {
		this.legalFramework = Objects.requireNonNull(legalFramework);
		return this;
	}

	public SecuritiesTransactionTypeV2Code getSecuritiesTransactionType() {
		return securitiesTransactionType;
	}

	public SecuritiesTrade setSecuritiesTransactionType(SecuritiesTransactionTypeV2Code securitiesTransactionType) {
		this.securitiesTransactionType = Objects.requireNonNull(securitiesTransactionType);
		return this;
	}
}