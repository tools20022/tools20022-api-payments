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
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * One of a number of related assets offered as part of the same transaction.
 * The detachment point less the attachment point represents the maximum loss.<br>
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Tranche" src="doc-files/Tranche.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Tranche#mmAsset
 * Tranche.mmAsset}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tranche#mmDetachmentPoint
 * Tranche.mmDetachmentPoint}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tranche#mmAttachmentPoint
 * Tranche.mmAttachmentPoint}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#mmTranche
 * Asset.mmTranche}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Tranche"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "One of a number of related assets offered as part of the same transaction. The detachment point less the attachment  point represents the maximum loss.\r\n"
 * </li>
 * </ul>
 */
public class Tranche {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Asset asset;
	/**
	 * Specifies the asset for which tranche information is reported.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Asset#mmTranche
	 * Asset.mmTranche}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tranche
	 * Tranche}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Asset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the asset for which tranche information is reported."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAsset = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tranche.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Asset";
			definition = "Specifies the asset for which tranche information is reported.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Asset.mmTranche;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
		}
	};
	protected BaseOneRate detachmentPoint;
	/**
	 * Point beyond which losses do not affect the tranche.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tranche
	 * Tranche}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DetachmentPoint"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Point beyond which losses do not affect the tranche."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDetachmentPoint = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tranche.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DetachmentPoint";
			definition = "Point beyond which losses do not affect the tranche.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Tranche.class.getMethod("getDetachmentPoint", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected BaseOneRate attachmentPoint;
	/**
	 * The attachment point defines the amount of subordination a tranche
	 * enjoys.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tranche
	 * Tranche}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttachmentPoint"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The attachment point defines the amount of subordination a tranche enjoys."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAttachmentPoint = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tranche.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttachmentPoint";
			definition = "The attachment point defines the amount of subordination a tranche enjoys.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Tranche.class.getMethod("getAttachmentPoint", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Tranche";
				definition = "One of a number of related assets offered as part of the same transaction. The detachment point less the attachment  point represents the maximum loss.\r\n";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Asset.mmTranche);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Tranche.mmAsset, com.tools20022.repository.entity.Tranche.mmDetachmentPoint, com.tools20022.repository.entity.Tranche.mmAttachmentPoint);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Tranche.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Asset getAsset() {
		return asset;
	}

	public void setAsset(com.tools20022.repository.entity.Asset asset) {
		this.asset = asset;
	}

	public BaseOneRate getDetachmentPoint() {
		return detachmentPoint;
	}

	public void setDetachmentPoint(BaseOneRate detachmentPoint) {
		this.detachmentPoint = detachmentPoint;
	}

	public BaseOneRate getAttachmentPoint() {
		return attachmentPoint;
	}

	public void setAttachmentPoint(BaseOneRate attachmentPoint) {
		this.attachmentPoint = attachmentPoint;
	}
}