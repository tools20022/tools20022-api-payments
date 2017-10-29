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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * <li>{@linkplain com.tools20022.repository.entity.TimeFrame#TradeMinus
 * TimeFrame.TradeMinus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TimeFrame#RenunciationMinus
 * TimeFrame.RenunciationMinus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TimeFrame#SubscriptionSettlementRelatedFundProcessing
 * TimeFrame.SubscriptionSettlementRelatedFundProcessing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TimeFrame#TradePlus
 * TimeFrame.TradePlus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TimeFrame#RenunciationPlus
 * TimeFrame.RenunciationPlus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TimeFrame#Prepayment
 * TimeFrame.Prepayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TimeFrame#OtherTimeFrameDescription
 * TimeFrame.OtherTimeFrameDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TimeFrame#RelatedProcessingCharacteristics
 * TimeFrame.RelatedProcessingCharacteristics}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#SettlementCycle
 * InvestmentFundClassProcessingCharacteristics.SettlementCycle}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#DealingCutOffTimeFrame
 * InvestmentFundClassProcessingCharacteristics.DealingCutOffTimeFrame}</li>
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
	/**
	 * An agreed number of days before the Trade date (T) used to define
	 * standard timeframes e.g. T-1 Dealing cut off or T-2 prepayment condition<br>
	 * Where = T is the date that the price is applied to a transaction,
	 * <p>
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
	public static final MMBusinessAttribute TradeMinus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> TimeFrame.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeMinus";
			definition = "An agreed number of days before the Trade date (T) used to define standard timeframes e.g. T-1 Dealing cut off or T-2 prepayment condition\r\nWhere = T is the date that the price is applied to a transaction,";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * An agreed number of days before the Renunciation of Title documents are
	 * received used to define standard timeframes in redemption.
	 * <p>
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
	public static final MMBusinessAttribute RenunciationMinus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> TimeFrame.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RenunciationMinus";
			definition = "An agreed number of days before the Renunciation of Title documents are received used to define standard timeframes in redemption.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Fund processing characteristics related to a subscription cycle.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#SettlementCycle
	 * InvestmentFundClassProcessingCharacteristics.SettlementCycle}</li>
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
	public static final MMBusinessAssociationEnd SubscriptionSettlementRelatedFundProcessing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TimeFrame.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubscriptionSettlementRelatedFundProcessing";
			definition = "Fund processing characteristics related to a subscription cycle.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.SettlementCycle;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * An agreed number of days after the Trade date (T) used to define standard
	 * timeframes e.g T+3 settlement period. <br>
	 * Where = T is the date that the price is applied to a transaction.
	 * <p>
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
	public static final MMBusinessAttribute TradePlus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> TimeFrame.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradePlus";
			definition = "An agreed number of days after the Trade date (T) used to define standard timeframes e.g T+3 settlement period. \r\nWhere = T is the date that the price is applied to a transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * An agreed number of days after the renunciation of title documents are
	 * received used to define standard timeframes in Redemption e.g R+3
	 * Redemption settlement cycle.
	 * <p>
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
	public static final MMBusinessAttribute RenunciationPlus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> TimeFrame.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RenunciationPlus";
			definition = "An agreed number of days after the renunciation of title documents are received used to define standard timeframes in Redemption e.g R+3 Redemption settlement cycle.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Indicates whether pre-payment is necessary.
	 * <p>
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
	public static final MMBusinessAttribute Prepayment = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> TimeFrame.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Prepayment";
			definition = "Indicates whether pre-payment is necessary.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies a description of any other TimeFrame that may be used for the
	 * DealingCutOffTimeFrame
	 * <p>
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
	public static final MMBusinessAttribute OtherTimeFrameDescription = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> TimeFrame.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OtherTimeFrameDescription";
			definition = "Specifies a description of any other TimeFrame that may be used for the DealingCutOffTimeFrame";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Processing characteristics for which a cut off time frame is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#DealingCutOffTimeFrame
	 * InvestmentFundClassProcessingCharacteristics.DealingCutOffTimeFrame}</li>
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
	public static final MMBusinessAssociationEnd RelatedProcessingCharacteristics = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TimeFrame.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedProcessingCharacteristics";
			definition = "Processing characteristics for which a cut off time frame is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.DealingCutOffTimeFrame;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TimeFrame";
				definition = "TimeFrame or period concept that allows definition of a period as number of days before or after a defined activity.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.SettlementCycle,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.DealingCutOffTimeFrame);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TimeFrame.TradeMinus, com.tools20022.repository.entity.TimeFrame.RenunciationMinus,
						com.tools20022.repository.entity.TimeFrame.SubscriptionSettlementRelatedFundProcessing, com.tools20022.repository.entity.TimeFrame.TradePlus, com.tools20022.repository.entity.TimeFrame.RenunciationPlus,
						com.tools20022.repository.entity.TimeFrame.Prepayment, com.tools20022.repository.entity.TimeFrame.OtherTimeFrameDescription, com.tools20022.repository.entity.TimeFrame.RelatedProcessingCharacteristics);
			}
		});
		return mmObject_lazy.get();
	}
}