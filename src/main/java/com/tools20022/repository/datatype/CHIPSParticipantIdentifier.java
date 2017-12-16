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

package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.CHIPSParticipantIdentifier.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * (United States) Clearing House Interbank Payment System (CHIPS) Participant
 * Identifier (ID). Identifies financial institutions participating on CHIPS.
 * The CHIPS Participant ID is assigned by the New York Clearing House.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMIdentifierSet#getIdentificationScheme
 * identificationScheme} =
 * "American Banker's Association (ABA); CHIPS Participant Number"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMString#getPattern pattern} =
 * "CP[0-9]{4,4}"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CP1234"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CHIPSParticipantIdentifier"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "(United States) Clearing House Interbank Payment System (CHIPS) Participant Identifier (ID). Identifies financial institutions participating on CHIPS. The CHIPS Participant ID is assigned by the New York Clearing House."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CHIPSParticipantIdentifier {

	final static private AtomicReference<MMIdentifierSet> mmObject_lazy = new AtomicReference<>();
	protected String value;

	final static public MMIdentifierSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIdentifierSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CP1234");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CHIPSParticipantIdentifier";
				definition = "(United States) Clearing House Interbank Payment System (CHIPS) Participant Identifier (ID). Identifies financial institutions participating on CHIPS. The CHIPS Participant ID is assigned by the New York Clearing House.";
				identificationScheme = "American Banker's Association (ABA); CHIPS Participant Number";
				pattern = "CP[0-9]{4,4}";
			}
		});
		return mmObject_lazy.get();
	}

	public CHIPSParticipantIdentifier(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CHIPSParticipantIdentifier> {
		@Override
		public CHIPSParticipantIdentifier unmarshal(String value) {
			return new CHIPSParticipantIdentifier(value);
		}

		@Override
		public String marshal(CHIPSParticipantIdentifier typedData) {
			return typedData.value;
		}
	}
}