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
import com.tools20022.repository.codeset.LotteryTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
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
 * <li>{@linkplain com.tools20022.repository.entity.Lottery#mmLotteryDate
 * Lottery.mmLotteryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Lottery#mmIncrementalDenomination
 * Lottery.mmIncrementalDenomination}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Lottery#mmLotteryType
 * Lottery.mmLotteryType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Lottery#mmRelatedCorporateEvent
 * Lottery.mmRelatedCorporateEvent}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmLottery
 * SecuritiesQuantity.mmLottery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmLottery
 * CorporateActionEvent.mmLottery}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected ISODateTime lotteryDate;
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
	public static final MMBusinessAttribute mmLotteryDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Lottery.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LotteryDate";
			definition = "Date on which the lottery is run and applied to the holder's positions. This is also applicable to partial calls.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Lottery.class.getMethod("getLotteryDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesQuantity incrementalDenomination;
	/**
	 * Amount used when the called amount is not met by running the lottery with
	 * the base denomination.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmLottery
	 * SecuritiesQuantity.mmLottery}</li>
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
	public static final MMBusinessAssociationEnd mmIncrementalDenomination = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Lottery.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncrementalDenomination";
			definition = "Amount used when the called amount is not met by running the lottery with the base denomination.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmLottery;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected LotteryTypeCode lotteryType;
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
	public static final MMBusinessAttribute mmLotteryType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Lottery.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LotteryType";
			definition = "Specifies the type of lottery announced.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LotteryTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Lottery.class.getMethod("getLotteryType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CorporateActionEvent relatedCorporateEvent;
	/**
	 * Corporate event for which lottery information is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmLottery
	 * CorporateActionEvent.mmLottery}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedCorporateEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Lottery.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateEvent";
			definition = "Corporate event for which lottery information is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmLottery;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Lottery";
				definition = "The parameters required to manage the organisation of a lottery.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesQuantity.mmLottery, com.tools20022.repository.entity.CorporateActionEvent.mmLottery);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Lottery.mmLotteryDate, com.tools20022.repository.entity.Lottery.mmIncrementalDenomination, com.tools20022.repository.entity.Lottery.mmLotteryType,
						com.tools20022.repository.entity.Lottery.mmRelatedCorporateEvent);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Lottery.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getLotteryDate() {
		return lotteryDate;
	}

	public void setLotteryDate(ISODateTime lotteryDate) {
		this.lotteryDate = lotteryDate;
	}

	public SecuritiesQuantity getIncrementalDenomination() {
		return incrementalDenomination;
	}

	public void setIncrementalDenomination(com.tools20022.repository.entity.SecuritiesQuantity incrementalDenomination) {
		this.incrementalDenomination = incrementalDenomination;
	}

	public LotteryTypeCode getLotteryType() {
		return lotteryType;
	}

	public void setLotteryType(LotteryTypeCode lotteryType) {
		this.lotteryType = lotteryType;
	}

	public CorporateActionEvent getRelatedCorporateEvent() {
		return relatedCorporateEvent;
	}

	public void setRelatedCorporateEvent(com.tools20022.repository.entity.CorporateActionEvent relatedCorporateEvent) {
		this.relatedCorporateEvent = relatedCorporateEvent;
	}
}