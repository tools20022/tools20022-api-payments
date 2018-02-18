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

import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.DocumentPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CreditorReferenceType2;
import com.tools20022.repository.msg.GarnishmentType1;
import com.tools20022.repository.msg.ReferredDocumentType4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Party that issues a document such as a bank guarantee or letter of /
 * documentary credit. For instance the inspection company for a trade
 * certificate or the insurance company or its agent for an insurance
 * certificate.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="DocumentIssuer" src="doc-files/DocumentIssuer.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.DocumentPartyRole
 * DocumentPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditorReferenceType2#mmIssuer
 * CreditorReferenceType2.mmIssuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GarnishmentType1#mmIssuer
 * GarnishmentType1.mmIssuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReferredDocumentType4#mmIssuer
 * ReferredDocumentType4.mmIssuer}</li>
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
 * "DocumentIssuer"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Party that issues a document such as a bank guarantee or letter of / documentary credit. For instance the inspection company for a trade certificate or the insurance company or its agent for an insurance certificate."
 * </li>
 * </ul>
 */
public class DocumentIssuer extends DocumentPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DocumentIssuer";
				definition = "Party that issues a document such as a bank guarantee or letter of / documentary credit. For instance the inspection company for a trade certificate or the insurance company or its agent for an insurance certificate.";
				derivationElement_lazy = () -> Arrays.asList(CreditorReferenceType2.mmIssuer, GarnishmentType1.mmIssuer, ReferredDocumentType4.mmIssuer);
				superType_lazy = () -> DocumentPartyRole.mmObject();
			}

			@Override
			public Class<?> getInstanceClass() {
				return DocumentIssuer.class;
			}
		});
		return mmObject_lazy.get();
	}
}