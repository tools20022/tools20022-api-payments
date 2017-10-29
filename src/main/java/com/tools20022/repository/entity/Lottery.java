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
import com.tools20022.repository.codeset.LotteryTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * The parameters required to manage the organisation of a lottery.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Lottery" src="doc-files/Lottery.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Lottery#LotteryDate
 * Lottery.LotteryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Lottery#IncrementalDenomination
 * Lottery.IncrementalDenomination}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Lottery#LotteryType
 * Lottery.LotteryType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Lottery#RelatedCorporateEvent
 * Lottery.RelatedCorporateEvent}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Lottery
 * SecuritiesQuantity.Lottery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#Lottery
 * CorporateActionEvent.Lottery}</li>
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
 * "Lottery"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The parameters required to manage the organisation of a lottery."</li>
 * </ul>
 */
public class Lottery {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Date on which the lottery is run and applied to the holder's positions.
	 * This is also applicable to partial calls.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Lottery
	 * Lottery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotteryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the lottery is run and applied to the holder's positions. This is also applicable to partial calls."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute LotteryDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Lottery.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LotteryDate";
			definition = "Date on which the lottery is run and applied to the holder's positions. This is also applicable to partial calls.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Amount used when the called amount is not met by running the lottery with
	 * the base denomination.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Lottery
	 * SecuritiesQuantity.Lottery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Lottery
	 * Lottery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncrementalDenomination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount used when the called amount is not met by running the lottery with the base denomination."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IncrementalDenomination = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Lottery.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IncrementalDenomination";
			definition = "Amount used when the called amount is not met by running the lottery with the base denomination.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.Lottery;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the type of lottery announced.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.LotteryTypeCode
	 * LotteryTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Lottery
	 * Lottery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotteryType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of lottery announced."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute LotteryType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Lottery.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LotteryType";
			definition = "Specifies the type of lottery announced.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> LotteryTypeCode.mmObject();
		}
	};
	/**
	 * Corporate event for which lottery information is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#Lottery
	 * CorporateActionEvent.Lottery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Lottery
	 * Lottery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCorporateEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate event for which lottery information is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedCorporateEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Lottery.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateEvent";
			definition = "Corporate event for which lottery information is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionEvent.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.Lottery;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Lottery";
				definition = "The parameters required to manage the organisation of a lottery.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesQuantity.Lottery, com.tools20022.repository.entity.CorporateActionEvent.Lottery);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Lottery.LotteryDate, com.tools20022.repository.entity.Lottery.IncrementalDenomination, com.tools20022.repository.entity.Lottery.LotteryType,
						com.tools20022.repository.entity.Lottery.RelatedCorporateEvent);
			}
		});
		return mmObject_lazy.get();
	}
}