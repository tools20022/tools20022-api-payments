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
import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.StayOnSideTypeCode;
import com.tools20022.repository.datatype.AllOrNoneIndicator;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Discretion;
import com.tools20022.repository.entity.SecuritiesOrder;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Identifies the instructions for order handling
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesOrderExecutionInstruction"
 * src="doc-files/SecuritiesOrderExecutionInstruction.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmAllOrNone
 * SecuritiesOrderExecutionInstruction.mmAllOrNone}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmCallFirst
 * SecuritiesOrderExecutionInstruction.mmCallFirst}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmCross
 * SecuritiesOrderExecutionInstruction.mmCross}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmCustomerDisplay
 * SecuritiesOrderExecutionInstruction.mmCustomerDisplay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmHold
 * SecuritiesOrderExecutionInstruction.mmHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmIncrease
 * SecuritiesOrderExecutionInstruction.mmIncrease}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmInstitutionsOnly
 * SecuritiesOrderExecutionInstruction.mmInstitutionsOnly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmNonNegotiable
 * SecuritiesOrderExecutionInstruction.mmNonNegotiable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmOverTheDay
 * SecuritiesOrderExecutionInstruction.mmOverTheDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmParticipateDontInitiate
 * SecuritiesOrderExecutionInstruction.mmParticipateDontInitiate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmPercentOfVolume
 * SecuritiesOrderExecutionInstruction.mmPercentOfVolume}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmScale
 * SecuritiesOrderExecutionInstruction.mmScale}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmStayOnSide
 * SecuritiesOrderExecutionInstruction.mmStayOnSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmWork
 * SecuritiesOrderExecutionInstruction.mmWork}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmGoAlong
 * SecuritiesOrderExecutionInstruction.mmGoAlong}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmTryScale
 * SecuritiesOrderExecutionInstruction.mmTryScale}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmDoNotReduce
 * SecuritiesOrderExecutionInstruction.mmDoNotReduce}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmCancelOnSystemFailure
 * SecuritiesOrderExecutionInstruction.mmCancelOnSystemFailure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmCancelOnTradingHalt
 * SecuritiesOrderExecutionInstruction.mmCancelOnTradingHalt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmTradeAlong
 * SecuritiesOrderExecutionInstruction.mmTradeAlong}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmStrictLimit
 * SecuritiesOrderExecutionInstruction.mmStrictLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmIgnorePriceValidityChecks
 * SecuritiesOrderExecutionInstruction.mmIgnorePriceValidityChecks}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmReinstateOnSystemFailure
 * SecuritiesOrderExecutionInstruction.mmReinstateOnSystemFailure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmReinstateOnTradingHalt
 * SecuritiesOrderExecutionInstruction.mmReinstateOnTradingHalt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmCancelIfNotBest
 * SecuritiesOrderExecutionInstruction.mmCancelIfNotBest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmExternalRoutingAllowed
 * SecuritiesOrderExecutionInstruction.mmExternalRoutingAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmExternalRoutingNotAllowed
 * SecuritiesOrderExecutionInstruction.mmExternalRoutingNotAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmImbalanceOnly
 * SecuritiesOrderExecutionInstruction.mmImbalanceOnly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmIntermarketSweep
 * SecuritiesOrderExecutionInstruction.mmIntermarketSweep}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmNetting
 * SecuritiesOrderExecutionInstruction.mmNetting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmRelatedOrder
 * SecuritiesOrderExecutionInstruction.mmRelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmForeignExchangeNetting
 * SecuritiesOrderExecutionInstruction.mmForeignExchangeNetting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmStrictScale
 * SecuritiesOrderExecutionInstruction.mmStrictScale}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmSuspend
 * SecuritiesOrderExecutionInstruction.mmSuspend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmTryToStop
 * SecuritiesOrderExecutionInstruction.mmTryToStop}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmOrderPriceStrategy
 * SecuritiesOrderExecutionInstruction.mmOrderPriceStrategy}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmExecutionInstructions
 * SecuritiesOrder.mmExecutionInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Discretion#mmRelatedOrderExecution
 * Discretion.mmRelatedOrderExecution}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesOrderExecutionInstruction"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the instructions for order handling"</li>
 * </ul>
 */
public class SecuritiesOrderExecutionInstruction {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected AllOrNoneIndicator allOrNone;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.AllOrNoneIndicator
	 * AllOrNoneIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 18 value "G"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllOrNone"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Round-lot market or limit-price order that must be executed in its entirety or not at all; unlike Fill or Kill orders, AON orders are not treated as canceled if they are not executed as soon as represented in the Trading Crowd."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesOrderExecutionInstruction, AllOrNoneIndicator> mmAllOrNone = new MMBusinessAttribute<SecuritiesOrderExecutionInstruction, AllOrNoneIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "18 value \"G\""));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AllOrNone";
			definition = "Round-lot market or limit-price order that must be executed in its entirety or not at all; unlike Fill or Kill orders, AON orders are not treated as canceled if they are not executed as soon as represented in the Trading Crowd.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AllOrNoneIndicator.mmObject();
		}

		@Override
		public AllOrNoneIndicator getValue(SecuritiesOrderExecutionInstruction obj) {
			return obj.getAllOrNone();
		}

		@Override
		public void setValue(SecuritiesOrderExecutionInstruction obj, AllOrNoneIndicator value) {
			obj.setAllOrNone(value);
		}
	};
	protected YesNoIndicator callFirst;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 18 value "C"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallFirst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Refers to the client before trading in order to catch all verbal instructions on trading strategy usually because the strategy is too complex or cannot be represented in the trading application."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator> mmCallFirst = new MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "18 value \"C\""));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CallFirst";
			definition = "Refers to the client before trading in order to catch all verbal instructions on trading strategy usually because the strategy is too complex or cannot be represented in the trading application.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesOrderExecutionInstruction obj) {
			return obj.getCallFirst();
		}

		@Override
		public void setValue(SecuritiesOrderExecutionInstruction obj, YesNoIndicator value) {
			obj.setCallFirst(value);
		}
	};
	protected YesNoIndicator cross;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 18 values "A" or "B"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cross"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Allow crossing of an order."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator> mmCross = new MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "18 values \"A\" or \"B\""));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Cross";
			definition = "Allow crossing of an order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesOrderExecutionInstruction obj) {
			return obj.getCross();
		}

		@Override
		public void setValue(SecuritiesOrderExecutionInstruction obj, YesNoIndicator value) {
			obj.setCross(value);
		}
	};
	protected YesNoIndicator customerDisplay;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 18 value "U"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerDisplay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Exchange or ECN required by the SEC to display limit orders in the public order book. A customer can choose not to have his limit order displayed to the public."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator> mmCustomerDisplay = new MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "18 value \"U\""));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CustomerDisplay";
			definition = "Exchange or ECN required by the SEC to display limit orders in the public order book. A customer can choose not to have his limit order displayed to the public.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesOrderExecutionInstruction obj) {
			return obj.getCustomerDisplay();
		}

		@Override
		public void setValue(SecuritiesOrderExecutionInstruction obj, YesNoIndicator value) {
			obj.setCustomerDisplay(value);
		}
	};
	protected YesNoIndicator hold;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 18 values "1" or "5"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Hold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the firm executing the order is held to best execution requirements and may be able to make some discretionary decisions."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator> mmHold = new MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "18 values \"1\"  or \"5\""));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Hold";
			definition = "Indicates whether the firm executing the order is held to best execution requirements and may be able to make some discretionary decisions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesOrderExecutionInstruction obj) {
			return obj.getHold();
		}

		@Override
		public void setValue(SecuritiesOrderExecutionInstruction obj, YesNoIndicator value) {
			obj.setHold(value);
		}
	};
	protected YesNoIndicator increase;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 18 value "E"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Increase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the order is to be increased in shares on the ex-dividend date as a result of a stock dividend or distribution."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator> mmIncrease = new MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "18 value \"E\""));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Increase";
			definition = "Indicates whether the order is to be increased in shares on the ex-dividend date as a result of a stock dividend or distribution.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesOrderExecutionInstruction obj) {
			return obj.getIncrease();
		}

		@Override
		public void setValue(SecuritiesOrderExecutionInstruction obj, YesNoIndicator value) {
			obj.setIncrease(value);
		}
	};
	protected YesNoIndicator institutionsOnly;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 18 value "I"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstitutionsOnly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies that the broker is restricted to dealing with other buy side firms."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator> mmInstitutionsOnly = new MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "18 value \"I\""));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstitutionsOnly";
			definition = "Identifies that the broker is restricted to dealing with other buy side firms.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesOrderExecutionInstruction obj) {
			return obj.getInstitutionsOnly();
		}

		@Override
		public void setValue(SecuritiesOrderExecutionInstruction obj, YesNoIndicator value) {
			obj.setInstitutionsOnly(value);
		}
	};
	protected YesNoIndicator nonNegotiable;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 18 value "N"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonNegotiable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Qualifies an asset (usually a payment instrument) of which rights cannot be transferred to a party other then the original debtor and creditor."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator> mmNonNegotiable = new MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "18 value \"N\""));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NonNegotiable";
			definition = "Qualifies an asset (usually a payment instrument) of which rights cannot be transferred to a party other then the original debtor and creditor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesOrderExecutionInstruction obj) {
			return obj.getNonNegotiable();
		}

		@Override
		public void setValue(SecuritiesOrderExecutionInstruction obj, YesNoIndicator value) {
			obj.setNonNegotiable(value);
		}
	};
	protected YesNoIndicator overTheDay;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 18 value "4"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OverTheDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether to execute parts of the order over the course of the day. Usually done with large block orders."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator> mmOverTheDay = new MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "18 value \"4\""));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OverTheDay";
			definition = "Indicates whether to execute parts of the order over the course of the day. Usually done with large block orders.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesOrderExecutionInstruction obj) {
			return obj.getOverTheDay();
		}

		@Override
		public void setValue(SecuritiesOrderExecutionInstruction obj, YesNoIndicator value) {
			obj.setOverTheDay(value);
		}
	};
	protected YesNoIndicator participateDontInitiate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 18 value "6"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParticipateDontInitiate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An order that may participate in a transaction initiated by another party, but may not initiate a transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator> mmParticipateDontInitiate = new MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "18 value \"6\""));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ParticipateDontInitiate";
			definition = "An order that may participate in a transaction initiated by another party, but may not initiate a transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesOrderExecutionInstruction obj) {
			return obj.getParticipateDontInitiate();
		}

		@Override
		public void setValue(SecuritiesOrderExecutionInstruction obj, YesNoIndicator value) {
			obj.setParticipateDontInitiate(value);
		}
	};
	protected YesNoIndicator percentOfVolume;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 18 value "D"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentOfVolume"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the Sender does not want all of the volume on the floor."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator> mmPercentOfVolume = new MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "18 value \"D\""));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PercentOfVolume";
			definition = "Indicates that the Sender does not want all of the volume on the floor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesOrderExecutionInstruction obj) {
			return obj.getPercentOfVolume();
		}

		@Override
		public void setValue(SecuritiesOrderExecutionInstruction obj, YesNoIndicator value) {
			obj.setPercentOfVolume(value);
		}
	};
	protected YesNoIndicator scale;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Scale"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An order to buy (or sell) a financial instrument which specifies the total amount to be bought (or sold) and the amount to be bought (or sold) at specified price variations."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator> mmScale = new MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Scale";
			definition = "An order to buy (or sell) a financial instrument which specifies the total amount to be bought (or sold) and the amount to be bought (or sold) at specified price variations.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesOrderExecutionInstruction obj) {
			return obj.getScale();
		}

		@Override
		public void setValue(SecuritiesOrderExecutionInstruction obj, YesNoIndicator value) {
			obj.setScale(value);
		}
	};
	protected StayOnSideTypeCode stayOnSide;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.StayOnSideTypeCode
	 * StayOnSideTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 18 value "9" or "0"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StayOnSide"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the order limit based on the offer/bid at the time of the order submission."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesOrderExecutionInstruction, StayOnSideTypeCode> mmStayOnSide = new MMBusinessAttribute<SecuritiesOrderExecutionInstruction, StayOnSideTypeCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "18 value \"9\" or \"0\""));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StayOnSide";
			definition = "Specifies the order limit based on the offer/bid at the time of the order submission.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> StayOnSideTypeCode.mmObject();
		}

		@Override
		public StayOnSideTypeCode getValue(SecuritiesOrderExecutionInstruction obj) {
			return obj.getStayOnSide();
		}

		@Override
		public void setValue(SecuritiesOrderExecutionInstruction obj, StayOnSideTypeCode value) {
			obj.setStayOnSide(value);
		}
	};
	protected YesNoIndicator work;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 18 value "2", FIXSynonym: 636</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Work"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Make the order active until notified."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator> mmWork = new MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "18 value \"2\""), new FIXSynonym(this, "636"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Work";
			definition = "Make the order active until notified.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesOrderExecutionInstruction obj) {
			return obj.getWork();
		}

		@Override
		public void setValue(SecuritiesOrderExecutionInstruction obj, YesNoIndicator value) {
			obj.setWork(value);
		}
	};
	protected YesNoIndicator goAlong;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 18 value 3</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GoAlong"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used for listed equity securities. Buy or sell at prices that randomly occur on the floor, participating in what\ntrades the specialist and other players will allow."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator> mmGoAlong = new MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "18 value 3"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GoAlong";
			definition = "Used for listed equity securities. Buy or sell at prices that randomly occur on the floor, participating in what\ntrades the specialist and other players will allow.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesOrderExecutionInstruction obj) {
			return obj.getGoAlong();
		}

		@Override
		public void setValue(SecuritiesOrderExecutionInstruction obj, YesNoIndicator value) {
			obj.setGoAlong(value);
		}
	};
	protected YesNoIndicator tryScale;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 18 value 8</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TryScale"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order to buy (sell) a security that specifies the total amount to be bought (sold) and the amount to be bought (sold) at successively decreasing (increasing) price intervals; often placed in order to average the price."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator> mmTryScale = new MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "18 value 8"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TryScale";
			definition = "Order to buy (sell) a security that specifies the total amount to be bought (sold) and the amount to be bought (sold) at successively decreasing (increasing) price intervals; often placed in order to average the price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesOrderExecutionInstruction obj) {
			return obj.getTryScale();
		}

		@Override
		public void setValue(SecuritiesOrderExecutionInstruction obj, YesNoIndicator value) {
			obj.setTryScale(value);
		}
	};
	protected YesNoIndicator doNotReduce;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 18 value F</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DoNotReduce"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether to buy, to stop order to sell, or to stop limit order to sell that is not to be reduced in price by the amount of an ordinary cash dividend on the ex-dividend date.  A \"do not reduce\" order applies only to ordinary cash dividends; it should be reduced for other distributions - such as when a stock goes ex stock dividend or ex rights."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator> mmDoNotReduce = new MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "18 value F"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DoNotReduce";
			definition = "Indicates whether to buy, to stop order to sell, or to stop limit order to sell that is not to be reduced in price by the amount of an ordinary cash dividend on the ex-dividend date.  A \"do not reduce\" order applies only to ordinary cash dividends; it should be reduced for other distributions - such as when a stock goes ex stock dividend or ex rights.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesOrderExecutionInstruction obj) {
			return obj.getDoNotReduce();
		}

		@Override
		public void setValue(SecuritiesOrderExecutionInstruction obj, YesNoIndicator value) {
			obj.setDoNotReduce(value);
		}
	};
	protected YesNoIndicator cancelOnSystemFailure;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 18 value H and Q</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelOnSystemFailure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If a system failure interrupts trading or order routing, attempt to cancel this order or attempt to reinstate this order, subject to time in force limitations. Note that depending on the type and severity of the failure, this might not be possible."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator> mmCancelOnSystemFailure = new MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "18 value H and Q"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancelOnSystemFailure";
			definition = "If a system failure interrupts trading or order routing, attempt to cancel this order or attempt to reinstate this order, subject to time in force limitations. Note that depending on the type and severity of the failure, this might not be possible.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesOrderExecutionInstruction obj) {
			return obj.getCancelOnSystemFailure();
		}

		@Override
		public void setValue(SecuritiesOrderExecutionInstruction obj, YesNoIndicator value) {
			obj.setCancelOnSystemFailure(value);
		}
	};
	protected YesNoIndicator cancelOnTradingHalt;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 18 value K and J</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelOnTradingHalt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If trading in this instrument is halted, cancel this order or reinstate this order when/if trading resumes, subject to time in force limitations."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator> mmCancelOnTradingHalt = new MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "18 value K and J"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancelOnTradingHalt";
			definition = "If trading in this instrument is halted, cancel this order or reinstate this order when/if trading resumes, subject to time in force limitations.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesOrderExecutionInstruction obj) {
			return obj.getCancelOnTradingHalt();
		}

		@Override
		public void setValue(SecuritiesOrderExecutionInstruction obj, YesNoIndicator value) {
			obj.setCancelOnTradingHalt(value);
		}
	};
	protected YesNoIndicator tradeAlong;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 18 value X</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeAlong"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the broker has permission to handle and place the order in the market even if  the broker already has its own proprietary orders for the same financial instrument placed in the market."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator> mmTradeAlong = new MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "18 value X"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeAlong";
			definition = "Indicates whether the broker has permission to handle and place the order in the market even if  the broker already has its own proprietary orders for the same financial instrument placed in the market.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesOrderExecutionInstruction obj) {
			return obj.getTradeAlong();
		}

		@Override
		public void setValue(SecuritiesOrderExecutionInstruction obj, YesNoIndicator value) {
			obj.setTradeAlong(value);
		}
	};
	protected YesNoIndicator strictLimit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StrictLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Limit order that must be traded at the exact limit price specified without any price improvement."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator> mmStrictLimit = new MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StrictLimit";
			definition = "Limit order that must be traded at the exact limit price specified without any price improvement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesOrderExecutionInstruction obj) {
			return obj.getStrictLimit();
		}

		@Override
		public void setValue(SecuritiesOrderExecutionInstruction obj, YesNoIndicator value) {
			obj.setStrictLimit(value);
		}
	};
	protected YesNoIndicator ignorePriceValidityChecks;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IgnorePriceValidityChecks"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Disables validity checking of price fields for an order or change request."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator> mmIgnorePriceValidityChecks = new MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IgnorePriceValidityChecks";
			definition = "Disables validity checking of price fields for an order or change request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesOrderExecutionInstruction obj) {
			return obj.getIgnorePriceValidityChecks();
		}

		@Override
		public void setValue(SecuritiesOrderExecutionInstruction obj, YesNoIndicator value) {
			obj.setIgnorePriceValidityChecks(value);
		}
	};
	protected YesNoIndicator reinstateOnSystemFailure;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinstateOnSystemFailure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If a system failure interrupts trading or order routing, attempt to reinstate this order, subject to time in force limitations. Depending on the type and severity of the failure, this might not be possible."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator> mmReinstateOnSystemFailure = new MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReinstateOnSystemFailure";
			definition = "If a system failure interrupts trading or order routing, attempt to reinstate this order, subject to time in force limitations. Depending on the type and severity of the failure, this might not be possible.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesOrderExecutionInstruction obj) {
			return obj.getReinstateOnSystemFailure();
		}

		@Override
		public void setValue(SecuritiesOrderExecutionInstruction obj, YesNoIndicator value) {
			obj.setReinstateOnSystemFailure(value);
		}
	};
	protected YesNoIndicator reinstateOnTradingHalt;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinstateOnTradingHalt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If trading in this instrument is halted, reinstate this order when/if trading resumes, subject to time in force limitations."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator> mmReinstateOnTradingHalt = new MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReinstateOnTradingHalt";
			definition = "If trading in this instrument is halted, reinstate this order when/if trading resumes, subject to time in force limitations.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesOrderExecutionInstruction obj) {
			return obj.getReinstateOnTradingHalt();
		}

		@Override
		public void setValue(SecuritiesOrderExecutionInstruction obj, YesNoIndicator value) {
			obj.setReinstateOnTradingHalt(value);
		}
	};
	protected YesNoIndicator cancelIfNotBest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelIfNotBest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that an order should be cancelled if it is no longer the best bid if buying, or the best offer if selling."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator> mmCancelIfNotBest = new MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancelIfNotBest";
			definition = "Indicates that an order should be cancelled if it is no longer the best bid if buying, or the best offer if selling.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesOrderExecutionInstruction obj) {
			return obj.getCancelIfNotBest();
		}

		@Override
		public void setValue(SecuritiesOrderExecutionInstruction obj, YesNoIndicator value) {
			obj.setCancelIfNotBest(value);
		}
	};
	protected YesNoIndicator externalRoutingAllowed;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExternalRoutingAllowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that an order sent to one market may be routed by that market to other external markets, especially in cases where the order locks or crosses the market and it can be executed against another markets superior price. The absence of this instruction does not imply that an order should not be routed externally; rather, the order receivers default will apply."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator> mmExternalRoutingAllowed = new MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExternalRoutingAllowed";
			definition = "Indicates that an order sent to one market may be routed by that market to other external markets, especially in cases where the order locks or crosses the market and it can be executed against another markets superior price. The absence of this instruction does not imply that an order should not be routed externally; rather, the order receivers default will apply.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesOrderExecutionInstruction obj) {
			return obj.getExternalRoutingAllowed();
		}

		@Override
		public void setValue(SecuritiesOrderExecutionInstruction obj, YesNoIndicator value) {
			obj.setExternalRoutingAllowed(value);
		}
	};
	protected YesNoIndicator externalRoutingNotAllowed;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExternalRoutingNotAllowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that an order sent to one market may never be routed by that market to other external markets. Should the order lock or cross the market but be unable to execute due to price protection reasons, a market may have to take alternate action, which might include rejecting the order, depending on the markets rules.The absence of this instruction does not imply that an order should be routed externally; rather, the order receivers default will apply."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator> mmExternalRoutingNotAllowed = new MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExternalRoutingNotAllowed";
			definition = "Indicates that an order sent to one market may never be routed by that market to other external markets. Should the order lock or cross the market but be unable to execute due to price protection reasons, a market may have to take alternate action, which might include rejecting the order, depending on the markets rules.The absence of this instruction does not imply that an order should be routed externally; rather, the order receivers default will apply.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesOrderExecutionInstruction obj) {
			return obj.getExternalRoutingNotAllowed();
		}

		@Override
		public void setValue(SecuritiesOrderExecutionInstruction obj, YesNoIndicator value) {
			obj.setExternalRoutingNotAllowed(value);
		}
	};
	protected YesNoIndicator imbalanceOnly;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ImbalanceOnly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the order can only hit the imbalance during a call auction. The imbalance is the remaining quantity when other buy and sell orders are matched at the auction clearing price."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator> mmImbalanceOnly = new MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ImbalanceOnly";
			definition = "Indicates that the order can only hit the imbalance during a call auction. The imbalance is the remaining quantity when other buy and sell orders are matched at the auction clearing price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesOrderExecutionInstruction obj) {
			return obj.getImbalanceOnly();
		}

		@Override
		public void setValue(SecuritiesOrderExecutionInstruction obj, YesNoIndicator value) {
			obj.setImbalanceOnly(value);
		}
	};
	protected YesNoIndicator intermarketSweep;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermarketSweep"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the party sending the order has taken responsibility for price protection, and the recipient of the order should execute it, if possible, without regard to protection of other markets prices. While the term \"Intermarket sweep\" is specific to the United States, it may be used in other markets, where appropriate, to indicate an order that should be executed without regard to price protection."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator> mmIntermarketSweep = new MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IntermarketSweep";
			definition = "Indicates that the party sending the order has taken responsibility for price protection, and the recipient of the order should execute it, if possible, without regard to protection of other markets prices. While the term \"Intermarket sweep\" is specific to the United States, it may be used in other markets, where appropriate, to indicate an order that should be executed without regard to price protection.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesOrderExecutionInstruction obj) {
			return obj.getIntermarketSweep();
		}

		@Override
		public void setValue(SecuritiesOrderExecutionInstruction obj, YesNoIndicator value) {
			obj.setIntermarketSweep(value);
		}
	};
	protected YesNoIndicator netting;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Netting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used when sending multiple orders indicating that you would be 'netting' the F/X later."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator> mmNetting = new MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Netting";
			definition = "Used when sending multiple orders indicating that you would be 'netting' the F/X later.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesOrderExecutionInstruction obj) {
			return obj.getNetting();
		}

		@Override
		public void setValue(SecuritiesOrderExecutionInstruction obj, YesNoIndicator value) {
			obj.setNetting(value);
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmExecutionInstructions
	 * SecuritiesOrder.mmExecutionInstructions}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order which is executed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesOrderExecutionInstruction, Optional<SecuritiesOrder>> mmRelatedOrder = new MMBusinessAssociationEnd<SecuritiesOrderExecutionInstruction, Optional<SecuritiesOrder>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedOrder";
			definition = "Order which is executed.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesOrder.mmExecutionInstructions;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesOrder.mmObject();
		}

		@Override
		public Optional<SecuritiesOrder> getValue(SecuritiesOrderExecutionInstruction obj) {
			return obj.getRelatedOrder();
		}

		@Override
		public void setValue(SecuritiesOrderExecutionInstruction obj, Optional<SecuritiesOrder> value) {
			obj.setRelatedOrder(value.orElse(null));
		}
	};
	protected YesNoIndicator foreignExchangeNetting;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 18 value "V"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeNetting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reduction of transfers of cash (resulting of a foreign exchange operation between subsidiaries or separate companies) to a net amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator> mmForeignExchangeNetting = new MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "18 value \"V\""));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ForeignExchangeNetting";
			definition = "Reduction of transfers of cash (resulting of a foreign exchange operation between subsidiaries or separate companies) to a net amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesOrderExecutionInstruction obj) {
			return obj.getForeignExchangeNetting();
		}

		@Override
		public void setValue(SecuritiesOrderExecutionInstruction obj, YesNoIndicator value) {
			obj.setForeignExchangeNetting(value);
		}
	};
	protected YesNoIndicator strictScale;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 18 value 7</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StrictScale"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order to buy (sell) a security that strictly specifies the total amount to be bought (sold) and the amount to be bought (sold) at successively decreasing (increasing) price intervals; often placed in order to average the price."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator> mmStrictScale = new MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "18 value 7"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StrictScale";
			definition = "Order to buy (sell) a security that strictly specifies the total amount to be bought (sold) and the amount to be bought (sold) at successively decreasing (increasing) price intervals; often placed in order to average the price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesOrderExecutionInstruction obj) {
			return obj.getStrictScale();
		}

		@Override
		public void setValue(SecuritiesOrderExecutionInstruction obj, YesNoIndicator value) {
			obj.setStrictScale(value);
		}
	};
	protected YesNoIndicator suspend;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 18 value S</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Suspend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used in specialist driven markets to direct the specialist to try to suspend the order."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator> mmSuspend = new MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "18 value S"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Suspend";
			definition = "Used in specialist driven markets to direct the specialist to try to suspend the order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesOrderExecutionInstruction obj) {
			return obj.getSuspend();
		}

		@Override
		public void setValue(SecuritiesOrderExecutionInstruction obj, YesNoIndicator value) {
			obj.setSuspend(value);
		}
	};
	protected YesNoIndicator tryToStop;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 18 value Y</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TryToStop"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used in specialist driven markets to direct the specialist to try and stop the order."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator> mmTryToStop = new MMBusinessAttribute<SecuritiesOrderExecutionInstruction, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "18 value Y"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TryToStop";
			definition = "Used in specialist driven markets to direct the specialist to try and stop the order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecuritiesOrderExecutionInstruction obj) {
			return obj.getTryToStop();
		}

		@Override
		public void setValue(SecuritiesOrderExecutionInstruction obj, YesNoIndicator value) {
			obj.setTryToStop(value);
		}
	};
	protected Discretion orderPriceStrategy;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Discretion#mmRelatedOrderExecution
	 * Discretion.mmRelatedOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Discretion
	 * Discretion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderPriceStrategy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Strategy used to obtain the order price."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesOrderExecutionInstruction, Discretion> mmOrderPriceStrategy = new MMBusinessAssociationEnd<SecuritiesOrderExecutionInstruction, Discretion>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrderPriceStrategy";
			definition = "Strategy used to obtain the order price.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Discretion.mmRelatedOrderExecution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Discretion.mmObject();
		}

		@Override
		public Discretion getValue(SecuritiesOrderExecutionInstruction obj) {
			return obj.getOrderPriceStrategy();
		}

		@Override
		public void setValue(SecuritiesOrderExecutionInstruction obj, Discretion value) {
			obj.setOrderPriceStrategy(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesOrderExecutionInstruction";
				definition = "Identifies the instructions for order handling";
				associationDomain_lazy = () -> Arrays.asList(SecuritiesOrder.mmExecutionInstructions, Discretion.mmRelatedOrderExecution);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmAllOrNone, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmCallFirst,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmCross, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmCustomerDisplay,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmHold, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmIncrease,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmInstitutionsOnly, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmNonNegotiable,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmOverTheDay, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmParticipateDontInitiate,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmPercentOfVolume, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmScale,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmStayOnSide, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmWork,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmGoAlong, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmTryScale,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmDoNotReduce, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmCancelOnSystemFailure,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmCancelOnTradingHalt, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmTradeAlong,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmStrictLimit, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmIgnorePriceValidityChecks,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmReinstateOnSystemFailure, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmReinstateOnTradingHalt,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmCancelIfNotBest, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmExternalRoutingAllowed,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmExternalRoutingNotAllowed, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmImbalanceOnly,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmIntermarketSweep, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmNetting,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmRelatedOrder, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmForeignExchangeNetting,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmStrictScale, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmSuspend,
						com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmTryToStop, com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction.mmOrderPriceStrategy);
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesOrderExecutionInstruction.class;
			}
		});
		return mmObject_lazy.get();
	}

	public AllOrNoneIndicator getAllOrNone() {
		return allOrNone;
	}

	public SecuritiesOrderExecutionInstruction setAllOrNone(AllOrNoneIndicator allOrNone) {
		this.allOrNone = Objects.requireNonNull(allOrNone);
		return this;
	}

	public YesNoIndicator getCallFirst() {
		return callFirst;
	}

	public SecuritiesOrderExecutionInstruction setCallFirst(YesNoIndicator callFirst) {
		this.callFirst = Objects.requireNonNull(callFirst);
		return this;
	}

	public YesNoIndicator getCross() {
		return cross;
	}

	public SecuritiesOrderExecutionInstruction setCross(YesNoIndicator cross) {
		this.cross = Objects.requireNonNull(cross);
		return this;
	}

	public YesNoIndicator getCustomerDisplay() {
		return customerDisplay;
	}

	public SecuritiesOrderExecutionInstruction setCustomerDisplay(YesNoIndicator customerDisplay) {
		this.customerDisplay = Objects.requireNonNull(customerDisplay);
		return this;
	}

	public YesNoIndicator getHold() {
		return hold;
	}

	public SecuritiesOrderExecutionInstruction setHold(YesNoIndicator hold) {
		this.hold = Objects.requireNonNull(hold);
		return this;
	}

	public YesNoIndicator getIncrease() {
		return increase;
	}

	public SecuritiesOrderExecutionInstruction setIncrease(YesNoIndicator increase) {
		this.increase = Objects.requireNonNull(increase);
		return this;
	}

	public YesNoIndicator getInstitutionsOnly() {
		return institutionsOnly;
	}

	public SecuritiesOrderExecutionInstruction setInstitutionsOnly(YesNoIndicator institutionsOnly) {
		this.institutionsOnly = Objects.requireNonNull(institutionsOnly);
		return this;
	}

	public YesNoIndicator getNonNegotiable() {
		return nonNegotiable;
	}

	public SecuritiesOrderExecutionInstruction setNonNegotiable(YesNoIndicator nonNegotiable) {
		this.nonNegotiable = Objects.requireNonNull(nonNegotiable);
		return this;
	}

	public YesNoIndicator getOverTheDay() {
		return overTheDay;
	}

	public SecuritiesOrderExecutionInstruction setOverTheDay(YesNoIndicator overTheDay) {
		this.overTheDay = Objects.requireNonNull(overTheDay);
		return this;
	}

	public YesNoIndicator getParticipateDontInitiate() {
		return participateDontInitiate;
	}

	public SecuritiesOrderExecutionInstruction setParticipateDontInitiate(YesNoIndicator participateDontInitiate) {
		this.participateDontInitiate = Objects.requireNonNull(participateDontInitiate);
		return this;
	}

	public YesNoIndicator getPercentOfVolume() {
		return percentOfVolume;
	}

	public SecuritiesOrderExecutionInstruction setPercentOfVolume(YesNoIndicator percentOfVolume) {
		this.percentOfVolume = Objects.requireNonNull(percentOfVolume);
		return this;
	}

	public YesNoIndicator getScale() {
		return scale;
	}

	public SecuritiesOrderExecutionInstruction setScale(YesNoIndicator scale) {
		this.scale = Objects.requireNonNull(scale);
		return this;
	}

	public StayOnSideTypeCode getStayOnSide() {
		return stayOnSide;
	}

	public SecuritiesOrderExecutionInstruction setStayOnSide(StayOnSideTypeCode stayOnSide) {
		this.stayOnSide = Objects.requireNonNull(stayOnSide);
		return this;
	}

	public YesNoIndicator getWork() {
		return work;
	}

	public SecuritiesOrderExecutionInstruction setWork(YesNoIndicator work) {
		this.work = Objects.requireNonNull(work);
		return this;
	}

	public YesNoIndicator getGoAlong() {
		return goAlong;
	}

	public SecuritiesOrderExecutionInstruction setGoAlong(YesNoIndicator goAlong) {
		this.goAlong = Objects.requireNonNull(goAlong);
		return this;
	}

	public YesNoIndicator getTryScale() {
		return tryScale;
	}

	public SecuritiesOrderExecutionInstruction setTryScale(YesNoIndicator tryScale) {
		this.tryScale = Objects.requireNonNull(tryScale);
		return this;
	}

	public YesNoIndicator getDoNotReduce() {
		return doNotReduce;
	}

	public SecuritiesOrderExecutionInstruction setDoNotReduce(YesNoIndicator doNotReduce) {
		this.doNotReduce = Objects.requireNonNull(doNotReduce);
		return this;
	}

	public YesNoIndicator getCancelOnSystemFailure() {
		return cancelOnSystemFailure;
	}

	public SecuritiesOrderExecutionInstruction setCancelOnSystemFailure(YesNoIndicator cancelOnSystemFailure) {
		this.cancelOnSystemFailure = Objects.requireNonNull(cancelOnSystemFailure);
		return this;
	}

	public YesNoIndicator getCancelOnTradingHalt() {
		return cancelOnTradingHalt;
	}

	public SecuritiesOrderExecutionInstruction setCancelOnTradingHalt(YesNoIndicator cancelOnTradingHalt) {
		this.cancelOnTradingHalt = Objects.requireNonNull(cancelOnTradingHalt);
		return this;
	}

	public YesNoIndicator getTradeAlong() {
		return tradeAlong;
	}

	public SecuritiesOrderExecutionInstruction setTradeAlong(YesNoIndicator tradeAlong) {
		this.tradeAlong = Objects.requireNonNull(tradeAlong);
		return this;
	}

	public YesNoIndicator getStrictLimit() {
		return strictLimit;
	}

	public SecuritiesOrderExecutionInstruction setStrictLimit(YesNoIndicator strictLimit) {
		this.strictLimit = Objects.requireNonNull(strictLimit);
		return this;
	}

	public YesNoIndicator getIgnorePriceValidityChecks() {
		return ignorePriceValidityChecks;
	}

	public SecuritiesOrderExecutionInstruction setIgnorePriceValidityChecks(YesNoIndicator ignorePriceValidityChecks) {
		this.ignorePriceValidityChecks = Objects.requireNonNull(ignorePriceValidityChecks);
		return this;
	}

	public YesNoIndicator getReinstateOnSystemFailure() {
		return reinstateOnSystemFailure;
	}

	public SecuritiesOrderExecutionInstruction setReinstateOnSystemFailure(YesNoIndicator reinstateOnSystemFailure) {
		this.reinstateOnSystemFailure = Objects.requireNonNull(reinstateOnSystemFailure);
		return this;
	}

	public YesNoIndicator getReinstateOnTradingHalt() {
		return reinstateOnTradingHalt;
	}

	public SecuritiesOrderExecutionInstruction setReinstateOnTradingHalt(YesNoIndicator reinstateOnTradingHalt) {
		this.reinstateOnTradingHalt = Objects.requireNonNull(reinstateOnTradingHalt);
		return this;
	}

	public YesNoIndicator getCancelIfNotBest() {
		return cancelIfNotBest;
	}

	public SecuritiesOrderExecutionInstruction setCancelIfNotBest(YesNoIndicator cancelIfNotBest) {
		this.cancelIfNotBest = Objects.requireNonNull(cancelIfNotBest);
		return this;
	}

	public YesNoIndicator getExternalRoutingAllowed() {
		return externalRoutingAllowed;
	}

	public SecuritiesOrderExecutionInstruction setExternalRoutingAllowed(YesNoIndicator externalRoutingAllowed) {
		this.externalRoutingAllowed = Objects.requireNonNull(externalRoutingAllowed);
		return this;
	}

	public YesNoIndicator getExternalRoutingNotAllowed() {
		return externalRoutingNotAllowed;
	}

	public SecuritiesOrderExecutionInstruction setExternalRoutingNotAllowed(YesNoIndicator externalRoutingNotAllowed) {
		this.externalRoutingNotAllowed = Objects.requireNonNull(externalRoutingNotAllowed);
		return this;
	}

	public YesNoIndicator getImbalanceOnly() {
		return imbalanceOnly;
	}

	public SecuritiesOrderExecutionInstruction setImbalanceOnly(YesNoIndicator imbalanceOnly) {
		this.imbalanceOnly = Objects.requireNonNull(imbalanceOnly);
		return this;
	}

	public YesNoIndicator getIntermarketSweep() {
		return intermarketSweep;
	}

	public SecuritiesOrderExecutionInstruction setIntermarketSweep(YesNoIndicator intermarketSweep) {
		this.intermarketSweep = Objects.requireNonNull(intermarketSweep);
		return this;
	}

	public YesNoIndicator getNetting() {
		return netting;
	}

	public SecuritiesOrderExecutionInstruction setNetting(YesNoIndicator netting) {
		this.netting = Objects.requireNonNull(netting);
		return this;
	}

	public Optional<SecuritiesOrder> getRelatedOrder() {
		return relatedOrder == null ? Optional.empty() : Optional.of(relatedOrder);
	}

	public SecuritiesOrderExecutionInstruction setRelatedOrder(SecuritiesOrder relatedOrder) {
		this.relatedOrder = relatedOrder;
		return this;
	}

	public YesNoIndicator getForeignExchangeNetting() {
		return foreignExchangeNetting;
	}

	public SecuritiesOrderExecutionInstruction setForeignExchangeNetting(YesNoIndicator foreignExchangeNetting) {
		this.foreignExchangeNetting = Objects.requireNonNull(foreignExchangeNetting);
		return this;
	}

	public YesNoIndicator getStrictScale() {
		return strictScale;
	}

	public SecuritiesOrderExecutionInstruction setStrictScale(YesNoIndicator strictScale) {
		this.strictScale = Objects.requireNonNull(strictScale);
		return this;
	}

	public YesNoIndicator getSuspend() {
		return suspend;
	}

	public SecuritiesOrderExecutionInstruction setSuspend(YesNoIndicator suspend) {
		this.suspend = Objects.requireNonNull(suspend);
		return this;
	}

	public YesNoIndicator getTryToStop() {
		return tryToStop;
	}

	public SecuritiesOrderExecutionInstruction setTryToStop(YesNoIndicator tryToStop) {
		this.tryToStop = Objects.requireNonNull(tryToStop);
		return this;
	}

	public Discretion getOrderPriceStrategy() {
		return orderPriceStrategy;
	}

	public SecuritiesOrderExecutionInstruction setOrderPriceStrategy(Discretion orderPriceStrategy) {
		this.orderPriceStrategy = Objects.requireNonNull(orderPriceStrategy);
		return this;
	}
}