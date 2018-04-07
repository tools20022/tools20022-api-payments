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

import com.tools20022.metamodel.MMAggregation;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.SettlementPartyRole;
import com.tools20022.repository.entity.StandingSettlementInstruction;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Provider of a standing settlement instruction (SSI) database.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SSIDatabaseProvider" src="doc-files/SSIDatabaseProvider.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.SettlementPartyRole
 * SettlementPartyRole}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SSIDatabaseProvider#mmStandingSettlementDatabase
 * SSIDatabaseProvider.mmStandingSettlementDatabase}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#mmSSIDatabaseProvider
 * StandingSettlementInstruction.mmSSIDatabaseProvider}</li>
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
 * "SSIDatabaseProvider"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provider of a standing settlement instruction (SSI) database."
 * </li>
 * </ul>
 */
public class SSIDatabaseProvider extends SettlementPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<StandingSettlementInstruction> standingSettlementDatabase;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#mmSSIDatabaseProvider
	 * StandingSettlementInstruction.mmSSIDatabaseProvider}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction
	 * StandingSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SSIDatabaseProvider
	 * SSIDatabaseProvider}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingSettlementDatabase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement instruction database information which is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SSIDatabaseProvider, List<StandingSettlementInstruction>> mmStandingSettlementDatabase = new MMBusinessAssociationEnd<SSIDatabaseProvider, List<StandingSettlementInstruction>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SSIDatabaseProvider.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StandingSettlementDatabase";
			definition = "Settlement instruction database information which is provided.";
			minOccurs = 0;
			opposite_lazy = () -> StandingSettlementInstruction.mmSSIDatabaseProvider;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> StandingSettlementInstruction.mmObject();
		}

		@Override
		public List<StandingSettlementInstruction> getValue(SSIDatabaseProvider obj) {
			return obj.getStandingSettlementDatabase();
		}

		@Override
		public void setValue(SSIDatabaseProvider obj, List<StandingSettlementInstruction> value) {
			obj.setStandingSettlementDatabase(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SSIDatabaseProvider";
				definition = "Provider of a standing settlement instruction (SSI) database.";
				associationDomain_lazy = () -> Arrays.asList(StandingSettlementInstruction.mmSSIDatabaseProvider);
				superType_lazy = () -> SettlementPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SSIDatabaseProvider.mmStandingSettlementDatabase);
			}

			@Override
			public Class<?> getInstanceClass() {
				return SSIDatabaseProvider.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<StandingSettlementInstruction> getStandingSettlementDatabase() {
		return standingSettlementDatabase == null ? standingSettlementDatabase = new ArrayList<>() : standingSettlementDatabase;
	}

	public SSIDatabaseProvider setStandingSettlementDatabase(List<StandingSettlementInstruction> standingSettlementDatabase) {
		this.standingSettlementDatabase = Objects.requireNonNull(standingSettlementDatabase);
		return this;
	}
}