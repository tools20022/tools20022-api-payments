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

import com.tools20022.metamodel.*;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * TimeFrame or period concept that allows definition of a period as number of
 * days before or after a defined activity.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="TimeFrame" src="doc-files/TimeFrame.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.TimeFrame#mmTradeMinus
 * TimeFrame.mmTradeMinus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TimeFrame#mmRenunciationMinus
 * TimeFrame.mmRenunciationMinus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TimeFrame#mmSubscriptionSettlementRelatedFundProcessing
 * TimeFrame.mmSubscriptionSettlementRelatedFundProcessing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TimeFrame#mmTradePlus
 * TimeFrame.mmTradePlus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TimeFrame#mmRenunciationPlus
 * TimeFrame.mmRenunciationPlus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TimeFrame#mmPrepayment
 * TimeFrame.mmPrepayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TimeFrame#mmOtherTimeFrameDescription
 * TimeFrame.mmOtherTimeFrameDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TimeFrame#mmRelatedProcessingCharacteristics
 * TimeFrame.mmRelatedProcessingCharacteristics}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmSettlementCycle
 * InvestmentFundClassProcessingCharacteristics.mmSettlementCycle}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmDealingCutOffTimeFrame
 * InvestmentFundClassProcessingCharacteristics.mmDealingCutOffTimeFrame}</li>
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
 * "TimeFrame"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "TimeFrame or period concept that allows definition of a period as number of days before or after a defined activity."
 * </li>
 * </ul>
 */
public class TimeFrame {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Number tradeMinus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.TimeFrame
	 * TimeFrame}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeMinus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An agreed number of days before the Trade date (T) used to define standard timeframes e.g. T-1 Dealing cut off or T-2 prepayment condition\r\nWhere = T is the date that the price is applied to a transaction,"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TimeFrame, Number> mmTradeMinus = new MMBusinessAttribute<TimeFrame, Number>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TimeFrame.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeMinus";
			definition = "An agreed number of days before the Trade date (T) used to define standard timeframes e.g. T-1 Dealing cut off or T-2 prepayment condition\r\nWhere = T is the date that the price is applied to a transaction,";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(TimeFrame obj) {
			return obj.getTradeMinus();
		}

		@Override
		public void setValue(TimeFrame obj, Number value) {
			obj.setTradeMinus(value);
		}
	};
	protected Number renunciationMinus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.TimeFrame
	 * TimeFrame}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RenunciationMinus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An agreed number of days before the Renunciation of Title documents are received used to define standard timeframes in redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TimeFrame, Number> mmRenunciationMinus = new MMBusinessAttribute<TimeFrame, Number>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TimeFrame.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RenunciationMinus";
			definition = "An agreed number of days before the Renunciation of Title documents are received used to define standard timeframes in redemption.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(TimeFrame obj) {
			return obj.getRenunciationMinus();
		}

		@Override
		public void setValue(TimeFrame obj, Number value) {
			obj.setRenunciationMinus(value);
		}
	};
	protected InvestmentFundClassProcessingCharacteristics subscriptionSettlementRelatedFundProcessing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmSettlementCycle
	 * InvestmentFundClassProcessingCharacteristics.mmSettlementCycle}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.TimeFrame
	 * TimeFrame}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionSettlementRelatedFundProcessing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fund processing characteristics related to a subscription cycle."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<TimeFrame, InvestmentFundClassProcessingCharacteristics> mmSubscriptionSettlementRelatedFundProcessing = new MMBusinessAssociationEnd<TimeFrame, InvestmentFundClassProcessingCharacteristics>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TimeFrame.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SubscriptionSettlementRelatedFundProcessing";
			definition = "Fund processing characteristics related to a subscription cycle.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmSettlementCycle;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
		}

		@Override
		public InvestmentFundClassProcessingCharacteristics getValue(TimeFrame obj) {
			return obj.getSubscriptionSettlementRelatedFundProcessing();
		}

		@Override
		public void setValue(TimeFrame obj, InvestmentFundClassProcessingCharacteristics value) {
			obj.setSubscriptionSettlementRelatedFundProcessing(value);
		}
	};
	protected Number tradePlus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.TimeFrame
	 * TimeFrame}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradePlus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An agreed number of days after the Trade date (T) used to define standard timeframes e.g T+3 settlement period. \r\nWhere = T is the date that the price is applied to a transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TimeFrame, Number> mmTradePlus = new MMBusinessAttribute<TimeFrame, Number>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TimeFrame.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradePlus";
			definition = "An agreed number of days after the Trade date (T) used to define standard timeframes e.g T+3 settlement period. \r\nWhere = T is the date that the price is applied to a transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(TimeFrame obj) {
			return obj.getTradePlus();
		}

		@Override
		public void setValue(TimeFrame obj, Number value) {
			obj.setTradePlus(value);
		}
	};
	protected Number renunciationPlus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.TimeFrame
	 * TimeFrame}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RenunciationPlus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An agreed number of days after the renunciation of title documents are received used to define standard timeframes in Redemption e.g R+3 Redemption settlement cycle."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TimeFrame, Number> mmRenunciationPlus = new MMBusinessAttribute<TimeFrame, Number>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TimeFrame.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RenunciationPlus";
			definition = "An agreed number of days after the renunciation of title documents are received used to define standard timeframes in Redemption e.g R+3 Redemption settlement cycle.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(TimeFrame obj) {
			return obj.getRenunciationPlus();
		}

		@Override
		public void setValue(TimeFrame obj, Number value) {
			obj.setRenunciationPlus(value);
		}
	};
	protected YesNoIndicator prepayment;
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.TimeFrame
	 * TimeFrame}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Prepayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether pre-payment is necessary."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TimeFrame, YesNoIndicator> mmPrepayment = new MMBusinessAttribute<TimeFrame, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TimeFrame.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Prepayment";
			definition = "Indicates whether pre-payment is necessary.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(TimeFrame obj) {
			return obj.getPrepayment();
		}

		@Override
		public void setValue(TimeFrame obj, YesNoIndicator value) {
			obj.setPrepayment(value);
		}
	};
	protected Max350Text otherTimeFrameDescription;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.TimeFrame
	 * TimeFrame}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherTimeFrameDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies a description of any other TimeFrame that may be used for the DealingCutOffTimeFrame"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TimeFrame, Max350Text> mmOtherTimeFrameDescription = new MMBusinessAttribute<TimeFrame, Max350Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TimeFrame.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OtherTimeFrameDescription";
			definition = "Specifies a description of any other TimeFrame that may be used for the DealingCutOffTimeFrame";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(TimeFrame obj) {
			return obj.getOtherTimeFrameDescription();
		}

		@Override
		public void setValue(TimeFrame obj, Max350Text value) {
			obj.setOtherTimeFrameDescription(value);
		}
	};
	protected InvestmentFundClassProcessingCharacteristics relatedProcessingCharacteristics;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmDealingCutOffTimeFrame
	 * InvestmentFundClassProcessingCharacteristics.mmDealingCutOffTimeFrame}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.TimeFrame
	 * TimeFrame}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedProcessingCharacteristics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Processing characteristics for which a cut off time frame is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<TimeFrame, InvestmentFundClassProcessingCharacteristics> mmRelatedProcessingCharacteristics = new MMBusinessAssociationEnd<TimeFrame, InvestmentFundClassProcessingCharacteristics>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TimeFrame.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedProcessingCharacteristics";
			definition = "Processing characteristics for which a cut off time frame is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmDealingCutOffTimeFrame;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
		}

		@Override
		public InvestmentFundClassProcessingCharacteristics getValue(TimeFrame obj) {
			return obj.getRelatedProcessingCharacteristics();
		}

		@Override
		public void setValue(TimeFrame obj, InvestmentFundClassProcessingCharacteristics value) {
			obj.setRelatedProcessingCharacteristics(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TimeFrame";
				definition = "TimeFrame or period concept that allows definition of a period as number of days before or after a defined activity.";
				associationDomain_lazy = () -> Arrays.asList(InvestmentFundClassProcessingCharacteristics.mmSettlementCycle, InvestmentFundClassProcessingCharacteristics.mmDealingCutOffTimeFrame);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TimeFrame.mmTradeMinus, com.tools20022.repository.entity.TimeFrame.mmRenunciationMinus,
						com.tools20022.repository.entity.TimeFrame.mmSubscriptionSettlementRelatedFundProcessing, com.tools20022.repository.entity.TimeFrame.mmTradePlus, com.tools20022.repository.entity.TimeFrame.mmRenunciationPlus,
						com.tools20022.repository.entity.TimeFrame.mmPrepayment, com.tools20022.repository.entity.TimeFrame.mmOtherTimeFrameDescription, com.tools20022.repository.entity.TimeFrame.mmRelatedProcessingCharacteristics);
			}

			@Override
			public Class<?> getInstanceClass() {
				return TimeFrame.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Number getTradeMinus() {
		return tradeMinus;
	}

	public TimeFrame setTradeMinus(Number tradeMinus) {
		this.tradeMinus = Objects.requireNonNull(tradeMinus);
		return this;
	}

	public Number getRenunciationMinus() {
		return renunciationMinus;
	}

	public TimeFrame setRenunciationMinus(Number renunciationMinus) {
		this.renunciationMinus = Objects.requireNonNull(renunciationMinus);
		return this;
	}

	public InvestmentFundClassProcessingCharacteristics getSubscriptionSettlementRelatedFundProcessing() {
		return subscriptionSettlementRelatedFundProcessing;
	}

	public TimeFrame setSubscriptionSettlementRelatedFundProcessing(InvestmentFundClassProcessingCharacteristics subscriptionSettlementRelatedFundProcessing) {
		this.subscriptionSettlementRelatedFundProcessing = Objects.requireNonNull(subscriptionSettlementRelatedFundProcessing);
		return this;
	}

	public Number getTradePlus() {
		return tradePlus;
	}

	public TimeFrame setTradePlus(Number tradePlus) {
		this.tradePlus = Objects.requireNonNull(tradePlus);
		return this;
	}

	public Number getRenunciationPlus() {
		return renunciationPlus;
	}

	public TimeFrame setRenunciationPlus(Number renunciationPlus) {
		this.renunciationPlus = Objects.requireNonNull(renunciationPlus);
		return this;
	}

	public YesNoIndicator getPrepayment() {
		return prepayment;
	}

	public TimeFrame setPrepayment(YesNoIndicator prepayment) {
		this.prepayment = Objects.requireNonNull(prepayment);
		return this;
	}

	public Max350Text getOtherTimeFrameDescription() {
		return otherTimeFrameDescription;
	}

	public TimeFrame setOtherTimeFrameDescription(Max350Text otherTimeFrameDescription) {
		this.otherTimeFrameDescription = Objects.requireNonNull(otherTimeFrameDescription);
		return this;
	}

	public InvestmentFundClassProcessingCharacteristics getRelatedProcessingCharacteristics() {
		return relatedProcessingCharacteristics;
	}

	public TimeFrame setRelatedProcessingCharacteristics(InvestmentFundClassProcessingCharacteristics relatedProcessingCharacteristics) {
		this.relatedProcessingCharacteristics = Objects.requireNonNull(relatedProcessingCharacteristics);
		return this;
	}
}